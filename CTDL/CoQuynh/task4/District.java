package task4;

import java.util.Arrays;

public class District {
	// ----------------FILL YOUR FULL NAME AND ID--------------------------
	/*
	 * Your full name: Id:
	 */
//////////////////////////////////////////////////////////////////////
	private String id;
	private String name;
	private PopulationSurvey[] array;

	public District(String id, String name, PopulationSurvey[] array) {
		super();
		this.id = id;
		this.name = name;
		this.array = array;
	}

	/*
	 * QUESTION 4: 1 POINT write toString() (0.5 point) test (0.5 point)
	 */
	public String toString() {
		return this.id + " " + this.name + " " + Arrays.toString(this.array);
	}

	/*
	 * QUESTION 5: 2 POINT write small program to get quantity of Population (1.5
	 * point) quantity of Population Of District = Sum Of all Survey(quantity male +
	 * quantity female) test (0.5 point)
	 */
	public int getQuantityPopulation() {
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			n += array[i].getQuantityFemale() + array[i].getQuantityMale();
		}
		return n;
	}

	/*
	 * QUESTION 6: 2 POINT write small program to get quantity of Population by
	 * gender (1.5 point) if isFemale = true => get population of Female if isFemale
	 * = false => get population of Male test (0.5 point)
	 */

	public int getPopulationByGender(boolean isFemale) {
		int n = 0;
		if (isFemale) {

			for (int i = 0; i < array.length; i++) {
				n += array[i].getQuantityFemale();
			}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopulationSurvey[] p = { new PopulationSurvey("dsad", "dsadas", 10, 10),
				new PopulationSurvey("dsad", "dsadas", 10, 10), new PopulationSurvey("dsad", "dsadas", 10, 10),
				new PopulationSurvey("dsad", "dsadas", 10, 10) };
		District d = new District("123cx", "dasjdh", p);
		System.out.println("so luong nu: " + d.getPopulationByGender(true));
		System.out.println("tong so luong hs: " + d.getQuantityPopulation());
		System.out.println(d.toString());
	}

}
