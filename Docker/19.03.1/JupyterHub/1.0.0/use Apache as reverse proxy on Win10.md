# Use Apache2.4 as a Reverse Proxy on Windows 10
1. Download **httpd-2.4.41-win64-VS16.zip** from [Apache Lounge](https://www.apachelounge.com/download/).
2. Change **SRVROOT** in **Apache24\conf\httpd.conf**.
3. Make sure the lines which contains **proxy_module**, **proxy_http_module**, **vhost_alias_module**, **proxy_wstunnel_module** and **Include conf/extra/httpd-vhosts.conf** are not commented.
4. Change **Apache24\conf\extra\httpd-vhosts.conf**. A sample can be seen as follows.
```
<VirtualHost *:80>
     RewriteEngine on

     #JupyterHub for shaolin
     RewriteCond %{HTTP:Connection} Upgrade [NC]
     RewriteCond %{HTTP:Upgrade} websocket [NC]
     RewriteRule /shaolin/jupyterhub/(.*) ws://127.0.0.1:38000/shaolin/jupyterhub/$1 [P]
	 
	 #JupyterHub for taichi
	 RewriteCond %{HTTP:Connection} Upgrade [NC]
     RewriteCond %{HTTP:Upgrade} websocket [NC]
	 RewriteRule /taichi/jupyterhub/(.*) ws://127.0.0.1:38001/taichi/jupyterhub/$1 [P]


     #Preserve Host header to avoid cross-origin problems
     ProxyPreserveHost On
	 
	 #JupyterHub for shaolin
     ProxyPass /shaolin/jupyterhub http://127.0.0.1:38000/shaolin/jupyterhub
     ProxyPassReverse /shaolin/jupyterhub  http://127.0.0.1:38000/shaolin/jupyterhub
	 
	 #JupyterHub for taichi
	 ProxyPass /taichi/jupyterhub http://127.0.0.1:38001/taichi/jupyterhub
     ProxyPassReverse /taichi/jupyterhub  http://127.0.0.1:38001/taichi/jupyterhub
</VirtualHost>
```
5. Save the file and execute **httpd -t** to test the configuration syntax.
6. Execute **httpd.exe -k install -n "Apache24"** to install a service.
7. Use **ApacheMonitor** to start **Apache**.
