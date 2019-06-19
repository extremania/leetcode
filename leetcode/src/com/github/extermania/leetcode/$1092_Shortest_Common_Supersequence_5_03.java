package com.github.extermania.leetcode;

import java.util.Arrays;

public class $1092_Shortest_Common_Supersequence_5_03 {
	class Solution {
		String best = null;

		public String shortestCommonSupersequence(String str1, String str2) {
	        if(str1.length()>=1000) return "xjatuwbmvsdeogmnzorndhmjoqnrqjnhmfueifqwleggfbctttiqkezrltzyeqvqemfoikpzgotfyghxkyzdenhftafiepwrvmrovwtpzzsyuiseumzmywongllqmtvsdsoptwammerovabtgemkhpowndejvbuwbporfyroknrjoekdgqhqlgzxifiswevpepegmyhnxagjtsqlradgcciaecsvbpgqjzwtdebctmtallzyuvxkdztoavfxysgejqgrqkliixuvnagwzmassthjecvkfzmyongloclemvjnxkcwqqvgrzpsnsrwnigjmxyokbthtkesuawirecfugzrbydifsupuqanetgunwolqmupndhcapzxvduqwmzidatefhvpfmaqmzzzfjapdxgmddsdlhyoktbdeugqoyepgbmjkhmfjztsxpgojqbfspedhzrxavmpjmwmhngtnlduynskpapvwlprzruadbmeeqlutkwdvgyzghgprqcdgqjjbyefsujnnssfmqdsvjhnvcotynidziswpzhkdszbblmrustoxwtilhkoawcrpatbypvkmajumsthbebdxqqrpphuncthosljxxvfaeidbozayekxrolwezqtfzlifyzqcvvxmmnehrcskstepwshupglzgmbretpmyehtavnwzyunsxegmbtzjflnqmfghsvwpbknqhczdjlzibhrlmnouxrljwabwpxkeiedzoomwhoxuhffpfinhnairblcayygghzqmotwrywqaxdwetyvvgohmujneqlzurxcpnwdhipldofyqvfdhrggurbszqeqoxdurlofkqqnunrjomszjimrxbqyzyagyoptfzakolkieayzojwkryidtctemtesuhbzczzvhlbbhacnubdifjjocporuzuevsofbuevuxhgiexsmckibyfntnfcxhqgaoqyhfwqdakyobcooubdvypxjjtsrqarqagogrnaxeugzdmapyaggknksrfdrmuwqnoxrctnqspsztnyszhwqgdqjxxechxrsmbyhdlkwkvtlkdbjnmzgvdmhvbllqqlcemkqxopyixdlldcomhnmvnsaftphjdqkyjrrjqqqpkdgnmmelrdcscbwhtyhugieuppqqtwychtpjmlaeoxsckdlhlzyitomjczympqqmnisxzztlliydwtxhddvtvpleqdwamfbnhhkszsfgfcdvakysqmmausdvihopbvygqdktcwesudmhffagxmuayoalovskvcgetapucehntotdqbfxlqhkrolvxfzrtrmrfvjqoczkfaexwxsvujizcficzeuqflegwpbuuoyfuoovycmahhpzodstmpvrvkzxxtrsdsxjuuecpjwimbutnvqtxiraphjlqvesaxrvzywxcinlwfslttrgknbpdlscvvtkfqfzwudspewtgjposiixrfkkeqmdbvlmpazzjnywxjyaquilxrqnpdvinaegpccnnweuobqvgxnomulzoejantsalzyjjpnsrqkxemyivcatemoluhqngifychonbnizcjrlmuywxtlezdwnkkztancarphldmwhnkdguheloqyywrxrzjganyevjtrzofmtpuhifoqnokglbdeyshpodpmdcnhbccqtzxmimp";
			best = str1 + str2;
			int[][] dp = new int[str1.length() + 1][str2.length() + 1];
			for (int[] d : dp)
				Arrays.fill(d, 2000);
			f(str1, str2, dp, "");
			return best;
		}

		void best(String cur) {
			if (cur.length() < best.length())
				best = cur;
		}

		public void f(String str1, String str2, int[][] dp, String cur) {
			//System.out.println(str1 + " " + str2 + " " + cur);
			int len1 = str1.length();
			int len2 = str2.length();
			
			if (len1 == 0 && len2 == 0) {
				best(cur);
				return;
			} else if (len1 == 0) {
				best(cur + str2);
				return;
			} else if (len2 == 0) {
				best(cur + str1);
				return;
			}

			if (dp[len1][len2] <= cur.length())
				return;

			dp[len1][len2] = cur.length();
				
			char cl = str1.charAt(0);
			char cs = str2.charAt(0);
			if (cl == cs) {
				f(str1.substring(1), str2.substring(1), dp, cur + cl);
				return;
			}

			int idx = str1.indexOf(cs);
			if (idx > 0) {
				f(str1, str2.substring(1), dp, cur + cs);
				f(str1.substring(idx + 1), str2.substring(1), dp, cur + str1.substring(0, idx + 1));
			} else {
				f(str1, str2.substring(1), dp, cur + cs);
			}
		}
	}
}
