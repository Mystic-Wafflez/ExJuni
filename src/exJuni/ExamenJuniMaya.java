package exJuni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExamenJuniMaya {
	public static void main(String[] args) {
		Plane plane1 = new Plane("Boeing 747", 13000, 85.75,59.6, 56.3);
		Plane plane2 = new Plane("Boeing 737", 10668, 62, 28, 29);
		Plane plane3 = new Plane("Placeholder Plane", 10000,50, 50, 60);
		Plane plane4 = new Plane("Randomizer Plane", Math.random() * 10000,Math.random()*60 , Math.random() * 100, Math.random() * 100);
		Plane plane5 = new Plane();
		Plane plane6 = new Plane();
		Plane plane7 = new Plane();
		BomberPlane plane8 = new BomberPlane("Myasishchev M-4", 11000,85.8 , 50.5, 47.2, 6);
		BomberPlane plane9 = new BomberPlane();
		BomberPlane plane10 = new BomberPlane();
		Hangar hangar1 = new Hangar((Math.random()*(100-20) + 20),(Math.random()*(100-20) + 20), Math.random() <0.5 );
		Hangar hangar2 = new Hangar();
		Hangar hangar3 = new Hangar();
		Hangar hangar4 = new Hangar();
		Hangar hangar5 = new Hangar();
		Hangar hangar6 = new Hangar();
		Hangar hangar7 = new Hangar();
		Hangar hangar8 = new Hangar();
		Hangar hangar9 = new Hangar();
		Hangar hangar10 = new Hangar();
		Hangar hangar11 = new Hangar();
		Hangar hangar12 = new Hangar();
		Hangar hangar13 = new Hangar();
		Hangar hangar14 = new Hangar();
		Hangar hangar15 = new Hangar();
		List<Plane> Planes = new ArrayList<>();
		Planes.add(plane1);
		Planes.add(plane2);
		Planes.add(plane3);
		Planes.add(plane4);
		Planes.add(plane5);
		Planes.add(plane6);
		Planes.add(plane7);
		Planes.add(plane8);
		Planes.add(plane9);
		Planes.add(plane10);
		try {
			calculateCeiling(plane8.vluchtplafond, plane8.aantalBommen);
		} catch (VluchtPlafondException e) {
			e.printStackTrace();
		}
		System.out.println(hangar1.height + " " + hangar1.bomberplanesafe);
	}

	public static void calculateCeiling(double vluchtplafond, int aantalBommen) throws VluchtPlafondException {
		double percentage = (3 * vluchtplafond / 100);
		double reduction = aantalBommen * percentage;
		double newceiling = vluchtplafond - reduction;
		if (newceiling > (80 * vluchtplafond) / 100) {

			System.out.println(newceiling);
		} else {
			throw new VluchtPlafondException("Vluchtplafond ligt onder 80%.");
		}

	}
}

