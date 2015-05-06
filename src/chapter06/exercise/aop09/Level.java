package chapter06.exercise.aop09;

public enum Level {

	GOLD(3, null), SILVER(2, GOLD), BASIC(1, SILVER);
	
	private final int value;
	
	private Level nextLevel;
	
	Level(int value, Level nextLevel) {
		this.value = value;
		this.nextLevel = nextLevel;
	}

	public int intValue() {
		return this.value;
	}
	
	public Level nextLevel(){
		return this.nextLevel;
	}

	public static Level valueOf(int value) {
		switch (value) {
			case 1:
				return BASIC;
			case 2:
				return SILVER;
			case 3:
				return GOLD;
			default:
				throw new AssertionError("Unknown value: " + value);
		}
	}

}