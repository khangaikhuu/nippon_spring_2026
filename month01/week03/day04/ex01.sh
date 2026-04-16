#!/bin/bash

PRICE=2500
TOTAL_INSERTED=0

echo "Drink price: $PRICE. "

while [ $TOTAL_INSERTED -lt $PRICE ]
do
	read -p "Give me money: " money
	TOTAL_INSERTED=$((TOTAL_INSERTED + money))
	
	if [ $TOTAL_INSERTED -lt $PRICE ]; then
		echo "Now: it is $TOTAL_INSERTED. You need
		to give $((PRICE - TOTAL_INSERTED)) more"
	fi
done

CHANGE=$((TOTAL_INSERTED - PRICE))
echo "HERE is your drink"
echo "HERE is your change: $CHANGE"
