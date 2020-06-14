# https://hub.docker.com/r/jupyterhub/jupyterhub/
FROM jupyterhub/jupyterhub:1.0

MAINTAINER Patrick Pan <patrick.pan2018@gmail.com>
LABEL date="2020-06-12"

# https://www.oracle.com/database/technologies/instant-client/linux-x86-64-downloads.html: Oracle Call Interface 19.3 can connect to Oracle Database 11.2 or later.
COPY instantclient-basic-linux.x64-19.3.0.0.0dbru.zip /opt/oracle/

# https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
ADD jdk-8u241-linux-x64.tar.gz /opt
RUN mv /etc/apt/sources.list /etc/apt/sources.list.bak \
    && echo "deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ bionic main restricted universe multiverse" >> /etc/apt/sources.list \
    && echo "deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ bionic-updates main restricted universe multiverse" >> /etc/apt/sources.list \
    && echo "deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ bionic-backports main restricted universe multiverse" >> /etc/apt/sources.list \
    && echo "deb https://mirrors.tuna.tsinghua.edu.cn/ubuntu/ bionic-security main restricted universe multiverse" >> /etc/apt/sources.list \
    && apt-get update \
    && apt-get install -y vim zip graphviz build-essential \
    && cd /opt/oracle \
    && unzip instantclient-basic-linux.x64-19.3.0.0.0dbru.zip \
    && rm -f instantclient-basic-linux.x64-19.3.0.0.0dbru.zip \
    && apt-get install -y libaio1 \
    && sh -c "echo /opt/oracle/instantclient_19_3 > /etc/ld.so.conf.d/oracle-instantclient.conf" \
    && ldconfig \
    && rm -fr /var/lib/apt/lists/* \
    && mkdir -p ~/.pip \
    && echo "[global]" >> ~/.pip/pip.conf \
    && echo "timeout = 60" >> ~/.pip/pip.conf \
    && echo "index-url = https://pypi.tuna.tsinghua.edu.cn/simple" >> ~/.pip/pip.conf \
    && sleep 5 \
    && pip install TensorFlow==2.1.0 \
    && sleep 60 \
    && pip install xgboost==1.0.2 \
    && sleep 10 \
    && pip install numpy==1.18.3 \
    && sleep 5 \
    && pip install pandas==1.0.3 \
    && sleep 10 \
    && pip install sklearn==0.0 \
    && sleep 10 \
    && pip install Scipy==1.4.1 \
    && sleep 10 \
    && pip install jupyter==1.0.0 \
    && sleep 5 \
    && pip install plotly==4.6.0 \
    && sleep 5 \
    && pip install Matplotlib==3.2.1 \
    && sleep 5 \
    && pip install seaborn==0.10.0 \
    && sleep 5 \
    && pip install Keras==2.3.1 \
    && sleep 10 \
    && pip install networkx==2.2 \
    && sleep 5 \
    && pip install colorlover==0.3.0 \
    && sleep 5 \
    && pip install sympy==1.5.1 \
    && sleep 5 \
    && pip install hyperopt==0.2.3 \
    && sleep 5 \
    && pip install cloudpickle==1.3.0 \
    && sleep 5 \
    && pip install dill==0.3.1.1 \
    && sleep 5 \
    && pip install pyldavis==2.1.2 \
    && sleep 5 \
    && pip install bokeh==2.0.0 \
    && sleep 5 \
    && pip install Cython==0.29.16 \
    && sleep 5 \
    && pip install numba==0.49.0 \
    && sleep 5 \
    && pip install ipywidgets==7.5.1 \
    && sleep 5 \
    && pip install wordcloud==1.6.0 \
    && sleep 5 \
    && pip install eli5==0.10.1 \
    && sleep 5 \
    && pip install lime==0.1.1.37 \
    && sleep 5 \
    && pip install tox==3.14.6 \
    && sleep 5 \
    && pip install tox-venv==0.4.0 \
    && sleep 5 \
    && pip install nltk==3.5 \
    && sleep 10 \
    && pip install gensim==3.8.2 \
    && sleep 10 \
    && pip install textblob==0.15.3 \
    && sleep 5 \
    && pip install scikit-learn==0.22.2.post1 \
    && sleep 5 \
    && pip install scikit-image==0.16.2 \
    && sleep 5 \
    && pip install xlrd==1.2.0 \
    && sleep 5 \
    && pip install jieba==0.42.1 \
    && sleep 5 \
    && pip install lightgbm==2.3.1 \
    && sleep 5 \
    && pip install imblearn==0.0 \
    && sleep 5 \
    && pip install cx_Oracle==7.3.0 \
    && sleep 5 \
    && pip install streamlit==0.56.0 \
    && sleep 5 \
    && pip install openpyxl==3.0.3 \
    && sleep 5 \
    && pip install pycryptodome==3.9.7 \
    && sleep 5 \
    && pip install sklearn2pmml==0.55.4 \
    && sleep 5 \
    && pip install wordcloud==1.6.0 \
    && sleep 5 \
    && pip install fuzzymatcher==0.0.5 \
    && sleep 5 \
    && pip install recordlinkage==0.14

ENV JAVA_HOME /opt/jdk1.8.0_241
ENV PATH /opt/oracle/instantclient_19_3:$JAVA_HOME/bin:$PATH
