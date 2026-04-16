#!/bin/bash

read -p "Give me A: " a
read -p "Give me B: " b 
read -p "Give me C: " c 

if [ $a -lt $b ]; then
	temp=$a; a=$b; b=$temp
fi
if [ $a -lt $c ]; then
	temp=$a; a=$c; c=$temp
fi
if [ $b -lt $c ]; then
	temp=$b; b=$c; c=$temp
fi




echo "Sorted: $a, $b, $c"
