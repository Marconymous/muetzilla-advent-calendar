using System;
using System.Collections.Generic;

class Problem11
{
    static void Main(string[] args)
    {
        var list = new List<string>();

        while (true)
        {
            Console.Write("Enter a word (or exit if you're done) > ");
            var str = Console.ReadLine();

            if (str is null or "exit") break;

            list.Add(str);
        }

        var split = new List<string>();

        foreach (var o in list)
        {
            var tup = SplitString(o);

            split.Add(tup.Item1);
            split.Add(tup.Item2);
        }

        var random = new Random();
        var final = new List<string>();
        while (split.Count > 0)
        {
            var str = new string[2];
            for (int i = 0; i < 2; i++)
            {
                var rand = random.Next(0, split.Count);
                str[i] = split[rand];
                split.Remove(str[i]);
            }

            final.Add(str[0] + str[1]);
        }

        foreach (var s in final)
        {
            Console.WriteLine(" > " + s);
        }
    }

    static Tuple<string, string> SplitString(string s)
    {
        var strLen = s.Length / 2;
        return new Tuple<string, string>(s.Substring(0, strLen), s.Substring(strLen, strLen));
    }
}