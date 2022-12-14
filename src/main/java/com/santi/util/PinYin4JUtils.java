package com.santi.util;

import java.util.Arrays;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class PinYin4JUtils {
	 /**
     * ???ַ???ת????ƴ??????
     *
     * @param src ?ַ???
     * @return
     */
    public static String[] stringToPinyin(String src) {
        return stringToPinyin(src, false, null);
    }

    /**
     * ???ַ???ת????ƴ??????
     *
     * @param src       ?ַ???
     * @param separator ??????ƴ??֮???ķָ???
     * @return
     */
    public static String[] stringToPinyin(String src, String separator) {
        return stringToPinyin(src, true, separator);
    }
    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs != null && (strLen = cs.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }
 
            return true;
        } else {
            return true;
        }
    }

    /**
     * ???ַ???ת????ƴ??????
     *
     * @param src         ?ַ???
     * @param isPolyphone ?Ƿ??????????ֵ?????ƴ??
     * @param separator   ??????ƴ??֮???ķָ???
     * @return
     */
    public static String[] stringToPinyin(String src, boolean isPolyphone, String separator) {
        // ?ж??ַ????Ƿ?Ϊ??
        if (isBlank(src)) {
            return null;
        }

        char[] srcChar = src.toCharArray();
        int srcCount = srcChar.length;
        String[] srcStr = new String[srcCount];

        for (int i = 0; i < srcCount; i++) {
            srcStr[i] = charToPinyin(srcChar[i], isPolyphone, separator);
        }
        return srcStr;
    }

    /**
     * ???????ַ?ת????ƴ??
     *
     * @param src         ??ת?????ַ?
     * @param isPolyphone ?Ƿ??????????ֵ?????ƴ??
     * @param separator   ??????ƴ??֮???ķָ???
     * @return
     */
    public static String charToPinyin(char src, boolean isPolyphone, String separator) {
        // ????????ƴ????????
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        // ???????ã???Сд?????귽ʽ
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

        StringBuffer tempPinying = new StringBuffer();

        // ??????????
        if (src > 128) {
            try {
                // ת???ó?????
                String[] strs = PinyinHelper.toHanyuPinyinStringArray(src, defaultFormat);

                // ?Ƿ??????????֣?Ĭ???ǲ????????ֵĵ?һ???ַ?
                if (isPolyphone && null != separator) {
                    for (int i = 0; i < strs.length; i++) {
                        tempPinying.append(strs[i]);
                        if (strs.length != (i + 1)) {
                            // ??????֮???????????ż???????
                            tempPinying.append(separator);
                        }
                    }
                } else {
                    tempPinying.append(strs[0]);
                }

            } catch (BadHanyuPinyinOutputFormatCombination e) {
                e.printStackTrace();
            }
        } else {
            tempPinying.append(src);
        }

        return tempPinying.toString();
    }

    /**
     * ??????ת????ƴ??
     *
     * @param hanzi
     * @return
     */
    public static String hanziToPinyin(String hanzi) {
        return hanziToPinyin(hanzi, " ");
    }

    /**
     * ??????ת????ƴ??
     *
     * @param hanzi     ????
     * @param separator ?ָ???
     * @return
     */
    public static String hanziToPinyin(String hanzi, String separator) {
        // ????????ƴ????????
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        // ???????ã???Сд?????귽ʽ
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

        String pinyingStr = "";
        try {
            pinyingStr = PinyinHelper.toHanYuPinyinString(hanzi, defaultFormat, separator,true);
        } catch (BadHanyuPinyinOutputFormatCombination e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return pinyingStr;
    }

    /**
     * ???ַ???????ת?????ַ???
     *
     * @param str
     * @param separator ?????ַ???֮???ķָ???
     * @return
     */
    public static String stringArrayToString(String[] str, String separator) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
            if (str.length != (i + 1)) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

    /**
     * ?򵥵Ľ??????ַ?????֮??????????
     *
     * @param str
     * @return
     */
    public static String stringArrayToString(String[] str) {
        return stringArrayToString(str, "");
    }

    /**
     * ???ַ?????ת?????ַ???
     *
     * @param ch        ?ַ?????
     * @param separator ?????ַ???֮???ķָ???
     * @return
     */
    public static String charArrayToString(char[] ch, String separator) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
            if (ch.length != (i + 1)) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

    /**
     * ???ַ?????ת?????ַ???
     *
     * @param ch ?ַ?????
     * @return
     */
    public static String charArrayToString(char[] ch) {
        return charArrayToString(ch, " ");
    }

    /**
     * ȡ???ֵ?????ĸ
     *
     * @param src
     * @param isCapital ?Ƿ??Ǵ?д
     * @return
     */
    public static char[] getHeadByChar(char src, boolean isCapital) {
        // ???????Ǻ???ֱ?ӷ???
        if (src <= 128) {
            return new char[]{src};
        }
        // ??ȡ???е?ƴ??
        String[] pinyingStr = PinyinHelper.toHanyuPinyinStringArray(src);

        // ???????ض???
        int polyphoneSize = pinyingStr.length;
        char[] headChars = new char[polyphoneSize];
        int i = 0;
        // ??ȡ???ַ?
        for (String s : pinyingStr) {
            char headChar = s.charAt(0);
            // ????ĸ?Ƿ???д??Ĭ????Сд
            if (isCapital) {
                headChars[i] = Character.toUpperCase(headChar);
            } else {
                headChars[i] = headChar;
            }
            i++;
        }

        return headChars;
    }

    /**
     * ȡ???ֵ?????ĸ(Ĭ???Ǵ?д)
     *
     * @param src
     * @return
     */
    public static char[] getHeadByChar(char src) {
        return getHeadByChar(src, true);
    }

    /**
     * ?????ַ???????ĸ
     *
     * @param src
     * @return
     */
    public static String[] getHeadByString(String src) {
        return getHeadByString(src, true);
    }

    /**
     * ?????ַ???????ĸ
     *
     * @param src
     * @param isCapital ?Ƿ???д
     * @return
     */
    public static String[] getHeadByString(String src, boolean isCapital) {
        return getHeadByString(src, isCapital, null);
    }

    /**
     * ?????ַ???????ĸ
     *
     * @param src       ?????ַ???
     * @param isCapital ?Ƿ???д
     * @param separator ?ָ???
     * @return
     */
    public static String[] getHeadByString(String src, boolean isCapital, String separator) {
        char[] chars = src.toCharArray();
        String[] headString = new String[chars.length];
        int i = 0;
        for (char ch : chars) {

            char[] chs = getHeadByChar(ch, isCapital);
            StringBuffer sb = new StringBuffer();
            if (null != separator) {
                int j = 1;

                for (char ch1 : chs) {
                    sb.append(ch1);
                    if (j != chs.length) {
                        sb.append(separator);
                    }
                    j++;
                }
            } else {
                sb.append(chs[0]);
            }
            headString[i] = sb.toString();
            i++;
        }
        return headString;
    }
    
/**	
 * ?????԰????ķ?????
 * 	??ȡÿ???ֵ?????ĸ??Сд??
 * @param text ??Ҫ??ȡ???ֶ?
 * @return	   
 */
    public static String getPinYin(String text) {
    	String[] headArray = getHeadByString(text); // ????ÿ??????ƴ??????ĸ
        String py = "";
        for (String string : headArray) {
        	py+=string;
		}
		return py.toLowerCase();
    }
//    public static void main(String[] args) {
//        // pin4j ???? ?? ???б???
//        String s1 = "??һ?̻?";
//        String[] headArray = getHeadByString(s1); // ????ÿ??????ƴ??????ĸ
//        String py = "";
//        for (String string : headArray) {
//        	py+=string;
//		}
//        System.out.println(py.toLowerCase());
//        String s2 = "????";
//        System.out.println(Arrays.toString(stringToPinyin(s2, true, ",")));
//
//        String s3 = "??";
//        System.out.println(Arrays.toString(stringToPinyin(s3, true, ",")));
//    }
}
