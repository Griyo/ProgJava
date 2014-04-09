package CalChamps;

public class Champion {
	float hp,hpReg,mana,manaReg,attackDamage,attackSpeed,armor,magicResistance,movementSpeed,range;
	float hp5,hpReg5,mana5,manaReg5,attackDamage5,ataackSpeed5,armor5,magicResistance5;

	public Champion(float hp, float hpReg, float mana, float manaReg, float attackDamage, float attackSpeed, 
			float armor, float magicResistance, float movementSpeed, float Range){
		this.hp=hp;
		this.hpReg=hpReg;
		this.mana=mana;
		this.manaReg=manaReg;
		this.attackDamage=attackDamage;
		this.attackSpeed=attackSpeed;
		this.armor=armor;
		this.magicResistance=magicResistance;
		this.movementSpeed=movementSpeed;
		this.range=Range;
	}

}
