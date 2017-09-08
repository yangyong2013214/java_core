package com.ycsoft.javacore.unit_5.equals;

public class Manager extends Employee
{
   private double bonus;

   public Manager(String n, double s, int year, int month, int day)
   {
      super(n, s, year, month, day);
      bonus = 0;
   }

   public double getSalary()
   {
      //super 调用父类的方法,
      double baseSalary = super.getSalary();
      //System.out.println("super.salary = " + super.salary);
      return baseSalary + bonus;
   }

   public void setBonus(double b)
   {
      bonus = b;
   }

   public boolean equals(Object otherObject)
   {
      if (!super.equals(otherObject)) return false;
      Manager other = (Manager) otherObject;
      // super.equals checked that this and other belong to the same class
      return bonus == other.bonus;
   }

   public int hashCode()
   {
      return super.hashCode() + 17 * new Double(bonus).hashCode();
   }

   public String toString()
   {
      return super.toString() + "[bonus=" + bonus + "]";
   }
}

