# use Apache as reverse proxy on RHEL7
1. Use **yum** to install **Apache** and my **Apache** version is 2.4.6.
2. **proxy_module**, **proxy_http_module**, **vhost_alias_module**, **proxy_wstunnel_module** are loaded by default. Command **apachectl -M** could be used to list loaded modules.
3. A template of **httpd-vhosts.conf** could be found in **/usr/share/doc/httpd-2.4.6**. Change it according to our requirements. A sample can be seen as follows.
```
<VirtualHost *:80>
     RewriteEngine on

     #JupyterHub for notebook
     RewriteCond %{HTTP:Connection} Upgrade [NC]
     RewriteCond %{HTTP:Upgrade} websocket [NC]
     RewriteRule /jupyter/notebook/(.*) ws://127.0.0.1:38000/jupyter/notebook/$1 [P]
	 
     #JupyterHub for lab
     RewriteCond %{HTTP:Connection} Upgrade [NC]
     RewriteCond %{HTTP:Upgrade} websocket [NC]
     RewriteRule /jupyter/lab/(.*) ws://127.0.0.1:38001/jupyter/lab/$1 [P]


     #Preserve Host header to avoid cross-origin problems
     ProxyPreserveHost On
	 
     #JupyterHub for notebook
     ProxyPass /jupyter/notebook http://127.0.0.1:38000/jupyter/notebook
     ProxyPassReverse /jupyter/notebook  http://127.0.0.1:38000/jupyter/notebook
	 
     #JupyterHub for lab
     ProxyPass /jupyter/lab http://127.0.0.1:38001/jupyter/lab
     ProxyPassReverse /jupyter/lab  http://127.0.0.1:38001/jupyter/lab
</VirtualHost>
```
4. Move **httpd-vhosts.conf** to **/etc/httpd/conf.d** and restart **Apache**.
