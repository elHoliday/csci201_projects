package edu.unca.csci201;

public class Forest {

	public static void main(String[] args) {

		
		String [][] treeType = 
			  { { "Maple", null, "Oak", "Yellow Birch"  },
				{ "Chestnut", null, "Gray Birch", "Larch", "Elm" },
				{ "Yellow Birch", null, "Oak", "Yellow Birch", "Elm", null },
				{ null, null, "Black Ash", "Yellow Birch", null, null, "Maple" },
				{ "Maple", null, "Oak", null, "Elm", null, "Black Ash" },
				{ null, null, "Maple", "Yellow Birch", "Elm", null, "Black Ash" },
				{ "Oak", null, "Oak", null, "Oak",  },
				{ "Maple", null, "Fir", "Yellow Birch" },
				{ "Maple", null, "Oak" }			
			  };
		
		double [][] treeHeight  = 
			  { { 20.5, -1, 18.5, 25.7  },
				{ 18.8, -1, 12.2, 69.8, 14.1 },
				{ 42.77, -1, 33.8, 79.4, 12.9, -1 },
				{ -1, -1, 115.8, 1.7, -1, -1, .87 },
				{ .24, -1, .35, -1, .79, -1, 15.1 },
				{ -1, -1, 13.5, 14.9, 18.9, -1, 12.8 },
				{ .59, -1, 33.8, -1, 25.8,  },
				{ 7.4, -1, .9999, 3.9 },
				{ 5.9, -1, 2.0 }			
			  };
		
		double [][] treeWidth =
			  { { 2.1, -1, 1.9, .89  },
				{ 3.9, -1, 1.4, 4.2, 1.9 },
				{ 5.2, -1, 1.2, 5.1, 1.1, -1 },
				{ -1, -1, 8.99, .1, -1, -1, .12 },
				{ .08, -1, .059, -1, .087, -1, 1.4 },
				{ -1, -1, 2.224, 1.45, .45, -1, 2.8 },
				{ .09, -1, 3.7, -1, 2.9,  },
				{ .86, -1, .05, 1.9 },
				{ .84, -1, .4 }			
			  };
		//set the length of the Tree object array to the length of treeType so you have room for all the trees
		
		Tree [][] forestData = new Tree [treeType.length][];
		
		//set the length of the first loop to forestData.length. A new tree is initialized for every tree type	
		for (int i=0; i < forestData.length; i++) {
			
			forestData[i]=new Tree[treeType[i].length];
			
		
		
		for (int j = 0 ; j < forestData[i].length; j++ ) {
			
			//treeType[i][j], treeHeight[i][j], treeWidth[i][j] function as variables
			//of the type declared in their respective arrays
	
			forestData[i][j]=new Tree(treeType[i][j],treeHeight[i][j],treeWidth[i][j]);
		
			System.out.println(" " +forestData[i][j]+ " ");
			System.out.println();
		}		
			
		}			

	}

}
