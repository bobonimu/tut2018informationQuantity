package s4.B183353; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID.
import java.lang.*;
import s4.specification.*;

/*
interface FrequencerInterface {     // This interface provides the design for frequency counter.
    void setTarget(byte[]  target); // set the data to search.
    void setSpace(byte[]  space);  // set the data to be searched target from.
    int frequency(); //It return -1, when TARGET is not set or TARGET's length is zero
                    //Otherwise, it return 0, when SPACE is not set or Space's length is zero
                    //Otherwise, get the frequency of TAGET in SPACE
    int subByteFrequency(int start, int end);
    // get the frequency of subByte of taget, i.e target[start], taget[start+1], ... , target[end-1].
    // For the incorrect value of START or END, the behavior is undefined.
}
*/

/*
package s4.specification;
public interface InformationEstimatorInterface{
    void setTarget(byte target[]); // set the data for computing the information quantities
    void setSpace(byte space[]); // set data for sample space to computer probability
    double estimation(); // It returns 0.0 when the target is not set or Target's length is zero;
// It returns Double.MAX_VALUE, when the true value is infinite, or space is not set.
// The behavior is undefined, if the true value is finete but larger than Double.MAX_VALUE.
// Note that this happens only when the space is unreasonably large. We will encounter other problem anyway.
// Otherwise, estimation of information quantity,
}
*/


public class TestCase {
    public static void main(String[] args) {
	try {
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("case1 :checking s4.B18353.Frequencer");
	    myObject = new s4.B183353.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
	    if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}

  try {
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("case2: checking s4.B183353.Frequencer");
      System.out.println("setSpaceに何も入力されていません。");
	    myObject = new s4.B183353.Frequencer();
	    myObject.setSpace("".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}

  try {
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("case3: checking s4.B183353.Frequencer");
      System.out.println("setSpaceが呼び出されていません。");
	    myObject = new s4.B183353.Frequencer();
	    //myObject.setSpace("".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
      e.printStackTrace(); //スタックトレースを出力する
	}

  try {
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("case4: checking s4.B183353.Frequencer");
      System.out.println("setTargetが呼び出されていません。");
	    myObject = new s4.B183353.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    //myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
      e.printStackTrace(); //スタックトレースを出力する
	}


  try {
	    FrequencerInterface  myObject;
	    int freq;
	    System.out.println("case5: checking s4.B183353.Frequencer");
	    myObject = new s4.B183353.Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("".getBytes());
	    freq = myObject.frequency();
	    if(-1 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
      e.printStackTrace(); //スタックトレースを出力する
  }

  try {
      FrequencerInterface  myObject;
      int freq;
      System.out.println("case6: checking s4.B183353.Frequencer");
      System.out.println("配列を超えています。");
      myObject = new s4.B183353.Frequencer();
      myObject.setSpace("AAAA".getBytes());
      myObject.setTarget("AA".getBytes());
      freq = myObject.frequency();
      if(3 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
  }
  catch(Exception e) {
      System.out.println("Exception occurred: STOP");
      e.printStackTrace(); //スタックトレースを出力する
  }

  try {
      FrequencerInterface  myObject;
      int freq;
      System.out.println("case7: checking s4.B183353.Frequencer");
      myObject = new s4.B183353.Frequencer();
      myObject.setSpace(" ".getBytes());
      myObject.setTarget("A".getBytes());
      freq = myObject.frequency();
      if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
  }
  catch(Exception e) {
      System.out.println("Exception occurred: STOP");
      e.printStackTrace(); //スタックトレースを出力する
  }




	try {
	    InformationEstimatorInterface myObject;
	    double value;
	    System.out.println("checking s4.B183353.InformationEstimator");
	    myObject = new s4.B183353.InformationEstimator();
	    myObject.setSpace("3210321001230123".getBytes());
	    myObject.setTarget("0".getBytes());
	    value = myObject.estimation();
	    System.out.println(">0 "+value);
	    myObject.setTarget("01".getBytes());
	    value = myObject.estimation();
	    System.out.println(">01 "+value);
	    myObject.setTarget("0123".getBytes());
	    value = myObject.estimation();
	    System.out.println(">0123 "+value);
	    myObject.setTarget("00".getBytes());
	    value = myObject.estimation();
	    System.out.println(">00 "+value);
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}

  try {
	    InformationEstimatorInterface myObject;
	    double value;
	    System.out.println("case8: checking s4.B183353.InformationEstimator");
	    myObject = new s4.B183353.InformationEstimator();
	    myObject.setSpace("".getBytes());
	    myObject.setTarget("0".getBytes());
	    value = myObject.estimation();
	    System.out.println(">0 "+value);
	    myObject.setTarget("01".getBytes());
	    value = myObject.estimation();
	    System.out.println(">01 "+value);
	    myObject.setTarget("0123".getBytes());
	    value = myObject.estimation();
	    System.out.println(">0123 "+value);
	    myObject.setTarget("00".getBytes());
	    value = myObject.estimation();
	    System.out.println(">00 "+value);
      if(value == 0) { System.out.println("OK"); } else {System.out.println("WRONG"); }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
      e.printStackTrace(); //スタックトレースを出力する
	}

  try {
      InformationEstimatorInterface myObject;
      double value;
      System.out.println("case9: checking s4.B183353.InformationEstimator");
      myObject = new s4.B183353.InformationEstimator();
      myObject.setSpace("3210321001230123".getBytes());
      myObject.setTarget("".getBytes());
      value = myObject.estimation();
      System.out.println(">0 "+value);
      myObject.setTarget("01".getBytes());
      value = myObject.estimation();
      System.out.println(">01 "+value);
      myObject.setTarget("0123".getBytes());
      value = myObject.estimation();
      System.out.println(">0123 "+value);
      myObject.setTarget("00".getBytes());
      value = myObject.estimation();
      System.out.println(">00 "+value);
      if(value == 0) { System.out.println("OK"); } else {System.out.println("WRONG"); }
  }
  catch(Exception e) {
      System.out.println("Exception occurred: STOP");
      e.printStackTrace(); //スタックトレースを出力する
  }

  try {
      InformationEstimatorInterface myObject;
      double value;
      System.out.println("case10: checking s4.B183353.InformationEstimator");
      System.out.println("setSpaceが呼び出されていません。");
      myObject = new s4.B183353.InformationEstimator();
      //myObject.setSpace("3210321001230123".getBytes());
      myObject.setTarget("".getBytes());
      value = myObject.estimation();
      System.out.println(">0 "+value);
      myObject.setTarget("01".getBytes());
      value = myObject.estimation();
      System.out.println(">01 "+value);
      myObject.setTarget("0123".getBytes());
      value = myObject.estimation();
      System.out.println(">0123 "+value);
      myObject.setTarget("00".getBytes());
      value = myObject.estimation();
      System.out.println(">00 "+value);
      if(value == Double.MAX_VALUE) { System.out.println("OK"); } else {System.out.println("WRONG"); }
  }
  catch(Exception e) {
      System.out.println("Exception occurred: STOP");
      e.printStackTrace(); //スタックトレースを出力する
  }


    }
}
