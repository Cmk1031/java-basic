package day08;

//학생 30명의 성적을 저장하고 평균을 구하는 프로그램

import java.io.*;

public class BuffedReaderWriter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        bw.write(str);
        bw.flush(); //남은 값 모두 출력하면서 비우기 가능

        int number = Integer.parseInt(br.readLine());
        for(int i=1; i<=number; i++) {

        }
    }
}
