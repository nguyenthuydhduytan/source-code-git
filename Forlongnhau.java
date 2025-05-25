public class Forlongnhau {
    public static void main(String[] args) {
        // Hình 1: Ma trận số
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n");  // Thêm 2 dòng trống
        
        // Hình 2: Đường chéo
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == j) {
                    System.out.print(i + "" + j + "\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        
        System.out.println("\n");  // Thêm 2 dòng trống
        
        // Hình 3: Hình vuông
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || i == 7 || j == 1 || j == 7) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
        
        System.out.println("\n");  // Thêm 2 dòng trống
        
        // Hình 4: Tam giác
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println();
        }
    }
}
    
