import java.util.*;


public class Looking_For_Internship {

    public static void print_row_0(String[] args, Set<Integer> rows) {
    	for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j == 0 || j == 4) {
    					System.out.print(args[0]);
    				} else if (j <= 12 && j >= 8) {
    					System.out.print(args[1]);
    				} else if (j <= 20 && j >= 16) {
    					System.out.print(args[2]);
    				} else if (j <= 28 && j >= 24) {
    					System.out.print(args[3]);
    				}
    			}
    			System.out.print("\n");
    } 

    public static void print_row_1_and_3(String[] args, Set<Integer> rows) {
    		for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j == 0 || j == 4) {
    					System.out.print(args[4]);
    				} else if (j == 10) {
    					System.out.print(args[1]);
    				} else if (j == 20 || j == 16) {
    					System.out.print(args[2]);
    				} else if (j == 24) {
    					System.out.print(args[3]);
    				}
    			}
    			System.out.print("\n");
    		
    } 

    public static void print_row_2(String[] args, Set<Integer> rows) {
    		for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j <= 4) {
    					System.out.print(args[0]);
    				} else if (j == 10) {
    					System.out.print(args[1]);
    				} else if (j <= 20 && j >= 16) {
    					System.out.print(args[2]);
    				} else if (j >= 24 && j <= 28) {
    					System.out.print(args[3]);
    				}
    			}
    			System.out.print("\n");
    		
    }

    public static void print_row_4(String[] args, Set<Integer> rows) {
    		for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j == 0 || j == 4) {
    					System.out.print(args[0]);
    				} else if (j <= 12 && j >= 8) {
    					System.out.print(args[1]);
    				} else if (j == 16 || j == 20) {
    					System.out.print(args[2]);
    				} else if (j <= 28 && j >= 24) {
    					System.out.print(args[3]);
    				}
    		}
    		System.out.print("\n");
    		System.out.print("\n");
    		
    }

    public static void print_row_7_and_11(String[] args, Set<Integer> rows) {
    		for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j == 7 || j == 11) {
    					System.out.print(args[4]);
    				} else if (j <= 12 && j >= 8) {
    					System.out.print(args[1]);
    				} else if (j <= 20 && j >= 16) {
    					System.out.print(args[3]);
    				}
    			}
    			System.out.print("\n");
    		
    }

    public static void print_row_8(String[] args, Set<Integer> rows) {
    		for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j >= 7 && j <= 11) {
    					System.out.print(args[4]);

    				} else if (j <= 12 && j >= 8) {
    					System.out.print(args[1]);
    				} else if (j == 16) {
    					System.out.print(args[3]);
    				}
    			}
    			System.out.print("\n");		
    }

    public static void print_row_9(String[] args, Set<Integer> rows) {
    		for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j == 7 || j == 9 || j == 11) {
    					System.out.print(args[4]);

    				} 
    				else if (j <= 20 && j >= 16) {
    					System.out.print(args[3]);
    				} 
    			}
    			System.out.print("\n");	
    }

    public static void print_row_10(String[] args, Set<Integer> rows) {
    	for (int j = 0; j < 29; j++) {
			if (rows.contains(j)) {
				System.out.print(args[8]);
			} else if (j == 7 || j == 11) {
				System.out.print(args[4]);
			}  else if (j == 16) {
				System.out.print(args[3]);
			}
    	}
    	System.out.print("\n");
    }


	public static void print_row_14_and_16(String[] args, Set<Integer> rows) {
    			System.out.print("\n");
    			for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j <= 8 && j >= 4) {
    					System.out.print(args[5]);
    				}  else if (j == 12) {
    					System.out.print(args[6]);
    				} else if (j <= 23 && j >= 19) {
    					System.out.print(args[7]);
    				}
    			}
    }

    public static void print_row_15(String[] args, Set<Integer> rows) {
    			System.out.print("\n");
    		
    			for (int j = 0; j < 29; j++) {
    				if (rows.contains(j)) {
    					System.out.print(args[8]);
    				} else if (j == 8 || j == 4) {
    					System.out.print(args[5]);
    				}  else if (j == 12) {
    					System.out.print(args[6]);
    				} else if (j == 19) {
    					System.out.print(args[7]);
    				}
    			}
    }

    public static void print_row_17(String[] args, Set<Integer> rows) {
    	System.out.print("\n");
		for (int j = 0; j < 29; j++) {
			if (rows.contains(j)) {
				System.out.print(args[8]);
			} else if (j == 4) {
				System.out.print(args[5]);
			}  else if (j == 12) {
				System.out.print(args[6]);
			} else if (j == 23) {
				System.out.print(args[7]);
			}
		}
	}

	public static void print_row_18(String[] args, Set<Integer> rows) {
		System.out.print("\n");
    		
		for (int j = 0; j < 29; j++) {
			if (rows.contains(j)) {
				System.out.print(args[8]);
			} else if (j == 4) {
				System.out.print(args[5]);
			}  else if (j >= 12 && j <= 16) {
				System.out.print(args[6]);
			} else if (j <= 23 && j >= 19) {
				System.out.print(args[7]);
			}
		}
	}

    public static void main (String[] args) {
    	System.out.print("\n");
    	System.out.print("\n");
    	String[] letters = {"H", "I", "R", "E", "M", "P", "L", "S", " "};
    	Set<Integer> row1 = new HashSet<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 5, 6, 7, 13, 14, 15, 21, 22, 23}));
    	Set<Integer> row2 = new HashSet<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 17, 18, 19, 21, 22, 23, 25, 26, 27, 28}));
    	Set<Integer> row3 = new HashSet<Integer>(Arrays.asList(new Integer[] {5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 21, 22, 23}));
    	Set<Integer> row4 = new HashSet<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 5, 6, 7, 13, 14, 15, 17, 18, 19, 21, 22, 23}));
    	Set<Integer> row7 = new HashSet<Integer>(Arrays.asList(new Integer[] {0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 13, 14, 15}));
    	Set<Integer> row8 = new HashSet<Integer>(Arrays.asList(new Integer[] {0, 1, 2, 3, 4, 5, 6, 9, 12, 13, 14, 15, 17, 18, 19, 20}));
    	Set<Integer> row9 = new HashSet<Integer>(Arrays.asList(new Integer[] {0, 1, 2, 3, 4, 5, 6, 8, 10, 12, 13, 14, 15}));
    	Set<Integer> row10 = new HashSet<Integer>(Arrays.asList(new Integer[] {0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 13, 14, 15, 17, 18, 19, 20}));
    	Set<Integer> row14 = new HashSet<Integer>(Arrays.asList(new Integer[] {0, 1, 2, 3, 9, 10, 11, 13, 14, 15, 16, 17, 18}));
    	Set<Integer> row15 = new HashSet<Integer>(Arrays.asList(new Integer[] {0, 1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18}));
    	Set<Integer> row17 = new HashSet<Integer>(Arrays.asList(new Integer[] {0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22}));
    	Set<Integer> row18 = new HashSet<Integer>(Arrays.asList(new Integer[] {0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 17, 18}));

    	for (int row = 0; row < 20; row++) {
    		if (row == 0) {
    			print_row_0(letters, row1);
    		}  else if (row == 1 || row == 3) {
    			print_row_1_and_3(letters, row2);
    		} else if (row == 2) {
    			print_row_2(letters, row3);
    		} else if (row == 4) {
    			print_row_4(letters, row4);
    		} else if (row == 7 || row == 11) {
    			print_row_7_and_11(letters, row7);
    		} else if (row == 8) {
    			print_row_8(letters, row8);		
    		} else if (row == 9) {
    			print_row_9(letters, row9);    		
    		} else if (row == 10) {
    			print_row_10(letters, row10);
    		}  else if (row == 14 || row == 16) {
    			print_row_14_and_16(letters, row14);
    		} else if (row == 15) {
    			print_row_15(letters, row15);
    		} else if (row == 17) {
    			print_row_17(letters, row17);
	    	} else if (row == 18) {
	    		print_row_18(letters, row18);
	    	}
    	}
	}
}
