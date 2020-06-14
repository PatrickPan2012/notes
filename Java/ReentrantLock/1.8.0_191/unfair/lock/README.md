1. 在采用Infinite Loop之前，都会先尝试一次CAS。若成功，就结束。否则，将触发Infinite Loop。这意味着一个新来的线程可能比其他等待已久的线程更快地获得锁，也就是unfair的含义；
2. 中断线程是采用Unsafe的API来实现的，而不是传统的sleep和wait；
3. “线程是否曾经被中断”将被严格记录。