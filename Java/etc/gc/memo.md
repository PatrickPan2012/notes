# Garbage Collection

##### Questions
  - What kinds of objects should be cleared or released?
  - How to find them?
  - When to start?

##### Answers
  - The useless or unreachable objects should be removed. How to define? There are two cases. On one hand, if an object is not strongly referenced by other objects, it can be marked as "to be cleared" directly. On the other hand, if an object is strongly referenced, garbage collectors have to analyse its reference chain. if the chain is a loop without being strongly referenced by any useful objects, or the head of it is a useless object, all objects in this chain will be marked as "to be cleared".
  - From the perspective of mainstream, there are three basic ways. They are "Reference Counting", "Mark and Sweep", and "Generational Garbage Collection" respectively. 
  - Use schedulers to run periodically or events to trigger.
  
  