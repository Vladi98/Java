using System;
using System.Collections.Generic;
using System.Text;

namespace MMtaskForInterview
{
    public class MMFigure
    {
        private int size;
        private StringBuilder sb;

        public MMFigure(int size)
        {
            this.size = size;
            this.sb = new StringBuilder();
        }

        public string BuildUpperPart()
        {
            this.sb.Clear();
            int a = 0;
            int b = this.size;

            for (int i = 0; i < this.size / 2 + 1; i++)
            {

                this.sb.Append(new string('-', this.size - i));
                this.sb.Append(new string('*', b));
                this.sb.Append(new string('-', this.size - a));
                this.sb.Append(new string('*', b));
                this.sb.Append(new string('-', this.size * 2 - a));

                this.sb.Append(new string('*', b));
                this.sb.Append(new string('-', this.size - a));
                this.sb.Append(new string('*', b));
                this.sb.Append(new string('-', this.size - i));

                this.sb.AppendLine();
                b += 2;
                a += 2;

            }
            return this.sb.ToString().Trim();
        }

        public string BuildLowerPart()
        {
            this.sb.Clear();
            int a = 1;

            for (int i = 0; i < this.size / 2 + 1; i++)
            {
                this.sb.Append(new string('-', this.size / 2 - i));
                this.sb.Append(new string('*', this.size));
                this.sb.Append(new string('-', a));
                this.sb.Append(new string('*', this.size * 2 - a));

                this.sb.Append(new string('-', a));
                this.sb.Append(new string('*', this.size));
                this.sb.Append(new string('-', this.size - a));

                this.sb.Append(new string('*', this.size));
                this.sb.Append(new string('-', a));
                this.sb.Append(new string('*', this.size * 2 - a));

                this.sb.Append(new string('-', a));
                this.sb.Append(new string('*', this.size));
                this.sb.Append(new string('-', this.size / 2 - i));


                this.sb.AppendLine();
                a += 2;
            }
            return this.sb.ToString().Trim();
        }

    }
}
