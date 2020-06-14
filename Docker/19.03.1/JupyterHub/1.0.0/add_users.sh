#!/bin/bash

usernames=('jonah_bu' 'gavin_shao' 'patrick_pan')

for username in ${usernames[@]}
do
    useradd -m -s /bin/bash $username

    # CentOS
    #echo $username | passwd --stdin $username

    # Ubuntu
    echo $username:$username|chpasswd
done


