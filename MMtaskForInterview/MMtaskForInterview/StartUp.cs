using System;

namespace MMtaskForInterview
{
    public class StartUp
    {
        public static void Main()
        {
            int n = int.Parse(Console.ReadLine());
            MMFigure mm = new MMFigure(n);

            Console.WriteLine(mm.BuildUpperPart());
            Console.WriteLine(mm.BuildLowerPart());
        }
    }
}
