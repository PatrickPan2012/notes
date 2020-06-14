# Lock

- Spinlock: **-XX:+UseSpinning** can be used to enable naive spinning on Java monitor before entering operating system thread synchronizaton code but it only applies to JDK 7 and earlier releases
- Biased LockingL: **-XX:+UseBiasedLocking** can be used to enable biased locking
- Lightweight Locking
- Heavyweight Locking

| **Heavyweight Locking** | **Spinlock** |
| ---- | --- |
| Mutex Lock - from **User Mode** to **Kernel Mode**, which means **interruption** is required while it is expensive | use **Atomic Access** instead of **interruption** |
| enter operating system thread synchronizaton code | continue to try, which is based on **CAS** and doesn't need **interruption**, until success or timeout. Threads would release CPU if and only if time slices are used up in this case. |
