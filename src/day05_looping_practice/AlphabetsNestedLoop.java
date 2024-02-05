package day05_looping_practice;

public class AlphabetsNestedLoop {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) { // column A to E

            for (char j = 'a'; j <= 'z'; j++) { // row a to z
                System.out.print(i +"" + j +" " );

        }
            System.out.println();


            //2nd way to do;
            /*
            String result = "";
            for (char i = 'A'; i <= 'E'; i++) {

            for (char j = 'a'; j <= 'z'; j++)
            result += i;
            result += j + "";
            result += "\n";

             println(result);

             */

        }

    }
}
/*
Create a class named Alphabets and use a nested loop to print the following
output:

		Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
		Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
		Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
		Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
		Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez


 */