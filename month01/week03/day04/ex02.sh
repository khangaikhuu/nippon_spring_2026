#!/bin/bash

read -p "How many numbers: " n

a=0
b=1
count=0

while [ $count -lt $n ]
do
	temp = $((a + b))
	a=$b
	b=$temp
	count=$((count + 1))
done


echo "Fibonacci number $n is : $a"
