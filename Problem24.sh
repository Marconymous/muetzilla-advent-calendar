#!/bin/sh

read -p "Enter the height of the tree > " TARGETHEIGHT

echo "TargetHeight: $TARGETHEIGHT"

leftspace=$TARGETHEIGHT
width=1
for ((i = 1; i <= TARGETHEIGHT; i++))
do

    spacer=""
    for ((ls = 1; ls <= leftspace; ls++))
    do
        spacer="$spacer "
    done
    echo -n "$spacer"

    row=""
    for ((w = 1; w <= width; w++))
    do
        row="$row*"
    done
    echo "$row"

    width=$((width+2))
    leftspace=$((leftspace-1))
done

trunkwidth=$((width/4))
spacerwidth=$(((width-trunkwidth)/2))

for ((i = 1; i <= trunkwidth; i++))
do
    for ((j = 1; j <= spacerwidth; j++))
    do
        echo -n " "
    done

    for ((j = 1; j <= trunkwidth; j++))
    do
        echo -n "*"
    done
    echo ""
done
