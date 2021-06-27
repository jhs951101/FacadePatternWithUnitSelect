package pkg;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		SelectUnitsWithOneKey selectunitswithonekey = new SelectUnitsWithOneKey();
		
		ProtossUnit scout1 = new Scout();
		ProtossUnit scout2 = new Scout();
		ProtossUnit scout3 = new Scout();
		ProtossUnit scout4 = new Scout();
		ProtossUnit scout5 = new Scout();
		ProtossUnit corsair1 = new Corsair();
		ProtossUnit corsair2 = new Corsair();
		ProtossUnit corsair3 = new Corsair();
		ProtossUnit observer1 = new Observer();
		
		ProtossUnit[] selectedunits = new ProtossUnit[9];
		
		selectedunits[0] = scout1;
		selectedunits[1] = scout2;
		selectedunits[2] = scout3;
		selectedunits[3] = scout4;
		selectedunits[4] = scout5;
		selectedunits[5] = corsair1;
		selectedunits[6] = corsair2;
		selectedunits[7] = corsair3;
		selectedunits[8] = observer1;
		
		selectunitswithonekey.registerUnitsWithKey(selectedunits);
		
		selectunitswithonekey.selectUnits();
		selectunitswithonekey.moveUnits(2, 5);
	}

}
