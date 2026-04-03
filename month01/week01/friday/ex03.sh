#!/bin/bash

AGE=$1

# greater equals
if [ $AGE -ge 18 ]; then
  echo "You can vote"
else
  echo "You can't vote"
fi
