/**
 * 
 *  MyThread t = new MyThread(); // instantiate a thread
 *  t.start();
 * 
 *      -> Once if we create a Thread, then our thread will be in new state or born state.
 *      -> Once t.start() method is called then our thread goes to Ready or Runnable state. (if it's called more than once IllegalThreadStateException is thrown)
 *      -> If Thread Scheduler allocates CPU for thread's execution then our thread will enter into running state.
 *      -> Once run() method execution is completed then our thread enters dead state.
 * 
 *      _________   t.start()   ________________  if TS allocates cpu   _________   running   ______
 *     |new/born |------>------| Ready/Runnable |----------->--------- | Running |----->-----| Dead | 
 *      ‾‾‾‾‾‾‾‾‾               ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾                        ‾‾‾‾‾‾‾‾‾             ‾‾‾‾‾‾
 * 
 * 
 */

 /*
                    Other CASES:
            Case 9:
                • After starting a Thread we are not allowed to restart the same Thread once again
                otherwise we will get runtime exception saying “IllegalThreadStateException”.
                            Example:
                            MyThread t=new MyThread();
                            t.start();//valid
                            t.start();//we will get R.E saying: IllegalThreadStateException

  */
 