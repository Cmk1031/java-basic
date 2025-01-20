package day08.복습;

import java.io.*;


public class Num9 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int studentNumber = 0;
        int scores[] = new int[0];

        while (true) {
            Menu();
            System.out.print("선택> ");
            String menuNumber = br.readLine();

            if (menuNumber.equals("5")) {
                bw.write("프로그램 종료");
                bw.flush();
                break;
            } else if (menuNumber.equals("1")) {
                studentNumber = Case1();
            } else if (menuNumber.equals("2")) {
                scores = Case2(studentNumber);
            } else if (menuNumber.equals("3")) {
                Case3(scores);
            } else if (menuNumber.equals("4")) {
                Case4(scores);
            }
        }
    }

    private static int Case1() throws IOException {
        bw.write("학생수>");
        bw.flush();
        int studentNumber = Integer.parseInt(br.readLine());
        bw.write(studentNumber);
        return studentNumber;
    }

    private static int[] Case2(int studentNumber) throws IOException {
        int[] scores = new int[studentNumber];
        for (int i = 0; i < studentNumber; i++) {
            bw.write("scores[" + i + "]>");
            bw.flush();
            scores[i] = Integer.parseInt(br.readLine());
        }
        return scores;

    }

    private static void Case3(int[] scores) throws IOException {
        for (int i = 0; i < scores.length; i++) {
            bw.write("scores[" + i + "]: " + scores[i] + "\n");
            bw.flush();
        }
    }

    private static void Case4(int[] scores) throws IOException {
        int max = 0;
        int sum = 0;
        for (int score : scores) {
            if (score >= max) {
                max = score;
            }
            sum += score;
        }
        bw.write("최고 점수: " + max + "\n");
        bw.write("평균 점수: " + (double) sum / scores.length + "\n");
        bw.flush();
    }

    public static void Menu() throws IOException  {
        bw.write("--------------------------------------------------------\n");
        bw.write("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료\n");
        bw.write("--------------------------------------------------------\n");
        bw.flush();
    }
}
