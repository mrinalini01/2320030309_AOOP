package com.gaming;

public interface GameElementFactory {
	Enemy createEnemy();
	Weapon createWeapon();
    PowerUp createPowerUp();
}
