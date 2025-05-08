/*Create class Number with only one private instance variable as a double
primitive type. To include the following methods (include respective
constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ),
isPrime(), isAmstrong() the above methods return boolean primitive type.
getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above
methods return double primitive type. void listFactor(), void dispBinary(). ?*/



//import java.lang.Math;

class Number
{

  private double num;

  Number(double n)
  {

    this.num = n;

  }

  public boolean isZero()
  {

    if(this.num == 0)
    {

      return true;

    } 
    else
    {

      return false;

    }

  }

  public boolean isNegative() {

    if(this.num < 0)
    {

      return true;

    } 
    else
    {

      return false;

    }
  }

  public boolean isOdd() 
  {

    if(this.num % 2 != 0) 
    {

      return true;

    } 
    else 
    {

      return false;

    }

  }

  public boolean isEven()
  {

    if(this.num % 2 == 0)
    {

      return true;

    }
    else
    {
      return false;
    }

  }

  public boolean isAmstrong()
  {

    double temp = this.num;

    double d = 0, l = 0, s = 0;

    while(temp > 0) {

      temp = (int)temp / 10;

      d++;

    }

    temp = this.num;

    while(temp > 0) {

      l = temp % 10;

      s = s + Math.pow(l, d);

      temp = (int)temp / 10;

    }

    if(this.num == s) 
    {

      return true;

    } else
    {

      return false;

    }

  }

  public double getSqrt()
  {

    return Math.sqrt(this.num);

  }

  public double getSqr()
  {

    return Math.pow(this.num, 2);

  }

  public double sumDigits() 
  {

    double temp = this.num, d, s = 0;

    while(temp > 0){

      d = temp % 10;

      s = s + d;

      temp = (int)temp / 10;

    }

    return s;

  }

  public double getReverse() 
  {

    double num = this.num, reverse = 0, rem;

    while(num != 0){

      rem = num % 10;

      reverse = reverse * 10 + rem;

      num = (int)num / 10;
    }

    return reverse;

  }

  public static void main(String args[]) {

    Number n = new Number(25);

    System.out.println(n.isZero());

    System.out.println(n.isNegative());

    System.out.println(n.isOdd());

    System.out.println(n.isEven());

    System.out.println(n.isAmstrong());

    System.out.println(n.getSqrt());

    System.out.println(n.getSqr());

    System.out.println(n.sumDigits());

    System.out.println(n.getReverse());

    }
  }