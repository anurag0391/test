/**
 *    ___               ___   ___   ___
 *   / _ \             / _ \ / _ \ / _ \
 *  | | |_|  _ _ __ __| (_) | (_) | (_) |
 *  | |_ _  | | '_ ` _ \___/ \___/ \___/
 *  |  _| |_| | | | | | | |  / _ \
 *  |_|  \__,_|_| |_| |_|_| | (_) |
 * ==========================\___/==========
 *     :: Digital Reactive Platform ::
 *
 * Copyright 2014 Ameriprise Financial, Inc. All rights reserved.
 * Proprietary and Confidential. Use is subject to license terms.
 */



public class Test
{

     enum Sound
    {
        NO1("hi"),YES1("bye");

        Sound(String hi) {
        }
    }

    public static void main(String[]args)
    {
System.out.println(Sound.valueOf("NO1"));
    }
}
