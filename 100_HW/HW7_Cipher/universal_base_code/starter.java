/*
 *	Author:Sara Soulahian
 *  Date: October 20, 2024
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Cipher no = new Cipher();
		
		String a = no.encode("6v lvp u5vuy5 y1z5 apsqy5r");
		System.out.println(a);
		
		String b = no.encode("sv8vq17r 1r 925 85rq");
		System.out.println(b);
		
		String c = no.encode("q25 z51 qv wpx85s f 1r 99");
		System.out.println(c);
		
		String d = no.keyedEncode("z8r8v 6yzzc 64r8 oys sx z8r8v 6y4z6 ty 18t oys 9y9z", 33);
		System.out.println(d);
		
		String f = no.encode("29y4 v4 v2g9w1r 05sr51 wpx85s 1r z51 qv d");
		System.out.println(f);
		
		String g = no.keyedEncode("a8 10y 92 1kx rxdj in 4", 8);
		System.out.println(g);
		
		String h = no.keyedEncode("549994u8 q3t sxys0u3 q7u Le vgb47y9u b9Tygrlu 3q2u8", 13);
		System.out.println(h);
		
		String i = no.keyedEncode("12xgx2cy g3d e98e6c3 gzc 4s bgv2z8XC Vgz8gf5c 3g4cy", 29);
		System.out.println(i);
		
		String j = no.encode("Ivpo5 rp775rr4pyyl 7vxuy5q56 925 41srg r5791VW");
		System.out.println(j);
		
		String k = no.keyedEncode("U4y ile i5 iGita5c 314cli66el i5f by6i5 hea5c zbi58 u4y", 27);
		System.out.println(k);
		
		String x = no.keyedEncode("amlb mfhp7fcj j1gq fo tap s9a bjls1ql aflipa 1b h1g9b 210z t9ct", 16);
		System.out.println(x);


		
	}
}
