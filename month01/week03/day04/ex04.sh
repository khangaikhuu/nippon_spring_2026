#!/bin/bash

SECRET=42
GUESS=0

echo "Give me number between 1 to 100: "

while [ $GUESS -ne $SECRET]
do
	read -p "Your guess: " GUESS
	
	if [ $GUESS -eq $SECRET ]; then
		echo "Congrats"
	elif [ $GUESS -gt $SECRET ]; then
		echo "Number is high"
	else
		echo "Number is low"
	fi
done
