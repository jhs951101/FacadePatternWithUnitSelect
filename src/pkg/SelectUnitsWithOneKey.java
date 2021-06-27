package pkg;

public class SelectUnitsWithOneKey {
	ProtossUnit key[];
	
	public void registerUnitsWithKey(ProtossUnit[] units){
		key = units;
	}
	
	public void selectUnits(){
		for(int i=0; i<key.length; i++){
			ProtossUnit unit = key[i];
			unit.select();
		}
	}
	
	public void moveUnits(int x, int y){
		for(int i=0; i<key.length; i++){
			ProtossUnit unit = key[i];
			unit.move(x, y);
		}
	}
	
	public void attackTogether(){
		for(int i=0; i<key.length; i++){
			ProtossUnit unit = key[i];
			unit.attack();
		}
	}
}
