package com.hugman.cataclysms_of_herobrine.util;

import java.util.Random;

public class MathHelper {
	public static boolean chance(int percentage) {
		if(percentage < 0) percentage = 0;
		if(percentage > 100) percentage = 100;
		Random random = new Random();
		return random.nextFloat() < (float)percentage / 10f;
	}
}
