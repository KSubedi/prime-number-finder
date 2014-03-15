<?php
$num = 1000000000;
$mod = 0;
$tcount;
$i;
$isRunning;

while(true){
	$tcount = 0;
	$i = 2;
	$isRunning = true;
	
	while($isRunning){
		if($i>=$num) $isRunning = false;
		$mod = $num%$i;
		if($mod == 0){
			$isRunning = false;
		}else{
			$tcount++;
			$i++;
		}				
	}
	
	if($i==$num && $tcount != $num){
		echo("Prime Number Found: " . $num . "\n");
	}
	
	
	$num++;
}