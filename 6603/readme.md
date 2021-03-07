백준 6603\
Lotto\
2021.3.4

Since we are using recursion, there must be a base step and a recursive step.

The Base Step:\
if the array has only one element, it has only one combination.

The recursive step:\
for each element, remove that element, get combinations from the rest of the array, add that element back in.

References:
https://web.stanford.edu/class/archive/cs/cs106b/cs106b.1126/lectures/08/Slides08.pdf