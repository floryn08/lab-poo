import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class crc_gen {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] data;
        int[] div;
        int[] divisor;
        int[] rem;
        int[] crc;
        int data_bits, divisor_bits, tot_length;

        System.out.println("Introduceti numarul de biti : ");
        data_bits = Integer.parseInt(br.readLine());
        data = new int[data_bits];

        System.out.println("Introduceti bitii: ");
        for (int i = 0; i < data_bits; i++) {
            System.out.println("bit[" + i + "]=");
            data[i] = Integer.parseInt(br.readLine());
            while (data[i] != 0 && data[i] != 1) {
                System.out.println("bit[" + i + "]=");
                data[i] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Introduceti numarul de biti din divizor: ");
        divisor_bits = Integer.parseInt(br.readLine());
        divisor = new int[divisor_bits];

        System.out.println("Introduceti bitii divizorului : ");
        for (int i = 0; i < divisor_bits; i++)


        {
            System.out.println("divizor[" + i + "]=");
            divisor[i] = Integer.parseInt(br.readLine());
            while (divisor[i] != 0 && divisor[i] != 1) {
                System.out.println("divizor[" + i + "]=");
                divisor[i] = Integer.parseInt(br.readLine());
            }
        }

        tot_length = data_bits + divisor_bits - 1;

        div = new int[tot_length];
        rem = new int[tot_length];
        crc = new int[tot_length];
    /*------------------ CRC GENERATION-----------------------*/
        for (int i = 0; i < data.length; i++)
            div[i] = data[i];

        System.out.print("Dividend (after appending 0's) are : ");
        for (int i = 0; i < div.length; i++)
            System.out.print(div[i]);
        System.out.println();

        for (int j = 0; j < div.length; j++) {
            rem[j] = div[j];
        }

        rem = divide(div, divisor, rem);

        for (int i = 0; i < div.length; i++)           //append dividend and ramainder
        {
            crc[i] = (div[i] ^ rem[i]);
        }

        System.out.println();
        System.out.println("CRC: ");
        for (int i = 0; i < crc.length; i++)
            System.out.print(crc[i]);
            
    /*-------------------ERROR DETECTION---------------------*/


    }

    static int[] divide(int div[], int divisor[], int rem[]) {
        int cur = 0;
        while (true) {
            for (int i = 0; i < divisor.length; i++)
                rem[cur + i] = (rem[cur + i] ^ divisor[i]);

            while (rem[cur] == 0 && cur != rem.length - 1)
                cur++;

            if ((rem.length - cur) < divisor.length)
                break;
        }
        return rem;
    }
}