package contest.dmoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DMOPC_2015_D_Mails {

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  static String[] names = {
      "Okabe",
      "Mayuri",
      "Daru",
      "Kurisu",
  };
  static String[] catchphrase = {"elpsycongroo", "tuturu", "superhacker", "myfork"};
  static int N;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    //br = new BufferedReader(new FileReader("in.txt"));
    //out = new PrintWriter(new FileWriter("out.txt"));

    N = readInt();

    for (int i = 0; i < N; i++) {
      String phrase = readLine();
      int cnt = 0;
      for (int j = 0; j < catchphrase.length; j++) {
        if (search(phrase, catchphrase[j])) {
          if (cnt == 0)
            out.print(names[j]);
          else
            out.print(" or " + names[j]);
          cnt++;
        }
      }
      if (cnt == 0)
        out.println("SERN spy!");
      else
        out.println();
    }

    out.close();
  }

  static boolean search(String text, String pattern) {
    int j = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == pattern.charAt(j)) {
        j++;
        if (j == pattern.length())
          return true;
      }
    }
    return false;
  }

  static String next() throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long readLong() throws IOException {
    return Long.parseLong(next());
  }

  static int readInt() throws IOException {
    return Integer.parseInt(next());
  }

  static double readDouble() throws IOException {
    return Double.parseDouble(next());
  }

  static char readCharacter() throws IOException {
    return next().charAt(0);
  }

  static String readLine() throws IOException {
    return br.readLine().trim();
  }
}
