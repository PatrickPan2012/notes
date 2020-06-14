# [cmd] --help

# Linux
  - pwd
  - alias ll="ls -hl"
  - tar -xvf/-czvf/-tvf
  - history 1000 | grep [keyword]
  - passwd
  - find [directory] -name [keyword]/"[pattern]" {-exec/-ok cmd {} \;}
  - firewall-cmd/ufw
  - cp
  - mv
  - rm -fr
  - tail -f [filename]
  - systemctl status/restart/start/enable/disable
  - chkconfig
  - netstat -tunlp
  - ps -ef|grep [keyword]
  - top
  - nohup [cmd]>>[log] 2>&1 &
  - adduser/useradd -m [username]
  - jobs
  - ctrl+c
  - ctrl+z bg/fg
  - grep -n [keyword] [filename] / grep -r [keyword] [directory]
  - ssh -i [identity filename] -p 12345
  - scp -i [identity filename] -P 12345
  - file -bi [filename]
  - df -h
  - du -hs [filename] / du -d1 -h [directory] | sort -h

# Git
  - git status
  - git checkout
  - git add
  - git commit {--amend}
  - git push
  - git log --graph --decorate
  - git merge [branch]
  - git cherry-pick