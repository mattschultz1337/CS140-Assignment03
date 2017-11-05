
<h1 data-pats="title_text" class="post_region_title">Assignment 3</h1>

<div class="post_region_text" id="questionText"><p><strong>UPDATED:&nbsp;</strong>DUE Wednesday Sept 27, 11:59pm</p>
<p>&nbsp;</p>
<p><strong>Assignment 3 Part I is Part I of Assignment 3 and is worth 30% of the grade. Lab03B is also worth 30% of the grade of Assignment 3.</strong></p>
<p>&nbsp;</p>
<p><strong><a href="http://www.cs.binghamton.edu/~lander/cs140/Fall17Assig3Part1.pdf" target="_blank" rel="noreferrer">Assignment 3 part 1 as a PDF</a></strong><strong> A typo was just fixed and uploaded--I think we announced it some time ago. I do not know why the upload of the correction failed)</strong></p>
<p>&nbsp;</p>
<p><strong>This is the remaining 40% is the following:</strong></p>
<p>&nbsp;</p>
<p>Make a class <tt>CalendarItem</tt> that imports <tt>java.time.LocalDateTime</tt>. The 6 private fields are: two <tt>LocalDateTime</tt> fields called <tt>start</tt> and <tt>end</tt>, three String fields called <tt>title</tt>, <tt>description</tt> and <tt>location</tt>, and one<tt> CalendarItem</tt> field called<tt> nextItem</tt>.</p>
<p>&nbsp;</p>
<p>We need <em>getters</em> and <em>setters</em> for all fields.</p>
<p>Add the lines</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">if</span><span class="pun">(</span><span class="pln">start </span><span class="pun">!=</span><span class="pln"> </span><span class="kwd">null</span><span class="pln"> </span><span class="pun">&amp;&amp;</span><span class="pln"> start</span><span class="pun">.</span><span class="pln">isAfter</span><span class="pun">(</span><span class="kwd">end</span><span class="pun">))</span><span class="pln">
	</span><span class="kwd">throw</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">IllegalArgumentException</span><span class="pun">(</span><span class="str">"the start cannot be after end"</span><span class="pun">);</span></pre>
<p>at the beginning of the <tt>setEnd</tt> and similar code to the beginning of <tt>setStart</tt>.</p>
<p>&nbsp;</p>
<p>Run the following main method:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">static</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> main</span><span class="pun">(</span><span class="typ">String</span><span class="pun">[]</span><span class="pln"> args</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="typ">CalendarItem</span><span class="pln"> test </span><span class="pun">=</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">CalendarItem</span><span class="pun">();</span><span class="pln">
	test</span><span class="pun">.</span><span class="pln">setDescription</span><span class="pun">(</span><span class="str">"this is just a sample meeting of CS 140"</span><span class="pun">);</span><span class="pln">
	test</span><span class="pun">.</span><span class="pln">setEnd</span><span class="pun">(</span><span class="typ">LocalDateTime</span><span class="pun">.</span><span class="pln">of</span><span class="pun">(</span><span class="lit">2017</span><span class="pun">,</span><span class="lit">9</span><span class="pun">,</span><span class="lit">11</span><span class="pun">,</span><span class="lit">11</span><span class="pun">,</span><span class="lit">50</span><span class="pun">));</span><span class="pln">
	test</span><span class="pun">.</span><span class="pln">setStart</span><span class="pun">(</span><span class="typ">LocalDateTime</span><span class="pun">.</span><span class="pln">of</span><span class="pun">(</span><span class="lit">2017</span><span class="pun">,</span><span class="lit">9</span><span class="pun">,</span><span class="lit">11</span><span class="pun">,</span><span class="lit">10</span><span class="pun">,</span><span class="lit">50</span><span class="pun">));</span><span class="pln">
	test</span><span class="pun">.</span><span class="pln">setTitle</span><span class="pun">(</span><span class="str">"CS 140"</span><span class="pun">);</span><span class="pln">
	test</span><span class="pun">.</span><span class="pln">setLocation</span><span class="pun">(</span><span class="str">"FA 212"</span><span class="pun">);</span><span class="pln">
	
	</span><span class="typ">System</span><span class="pun">.</span><span class="kwd">out</span><span class="pun">.</span><span class="pln">println</span><span class="pun">(</span><span class="pln">test</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>&nbsp;</p>
<p>The output is very disappointing, so liven it up with the following <tt>toString</tt> method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="com">// at the start of the class import java.time.format.DateTimeFormatter</span><span class="pln">
</span><span class="kwd">public</span><span class="pln"> </span><span class="typ">String</span><span class="pln"> toString</span><span class="pun">()</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="typ">DateTimeFormatter</span><span class="pln"> dayForm </span><span class="pun">=</span><span class="pln">  </span><span class="typ">DateTimeFormatter</span><span class="pun">.</span><span class="pln">ofPattern</span><span class="pun">(</span><span class="str">"MMMM d, yyyy"</span><span class="pun">);</span><span class="pln">
	</span><span class="typ">DateTimeFormatter</span><span class="pln"> timeForm </span><span class="pun">=</span><span class="pln">  </span><span class="typ">DateTimeFormatter</span><span class="pun">.</span><span class="pln">ofPattern</span><span class="pun">(</span><span class="str">"h:m a"</span><span class="pun">);</span><span class="pln">
	</span><span class="kwd">return</span><span class="pln"> start</span><span class="pun">.</span><span class="pln">format</span><span class="pun">(</span><span class="pln">dayForm</span><span class="pun">)</span><span class="pln"> </span><span class="pun">+</span><span class="str">" from "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> start</span><span class="pun">.</span><span class="pln">format</span><span class="pun">(</span><span class="pln">timeForm</span><span class="pun">)</span><span class="pln"> 
			</span><span class="pun">+</span><span class="pln"> </span><span class="str">" to "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> </span><span class="kwd">end</span><span class="pun">.</span><span class="pln">format</span><span class="pun">(</span><span class="pln">timeForm</span><span class="pun">)</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> </span><span class="str">"\n"</span><span class="pln">
			</span><span class="pun">+</span><span class="pln"> title </span><span class="pun">+</span><span class="pln"> </span><span class="str">" in "</span><span class="pln"> </span><span class="pun">+</span><span class="pln"> location </span><span class="pun">+</span><span class="pln"> </span><span class="str">"\n"</span><span class="pln">
			</span><span class="pun">+</span><span class="pln"> description</span><span class="pun">;</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>&nbsp;</p>
<p>There is a defect and that is that it does not print completely an appointment that goes across midnight, say from 11:30pm to 12:30am. It only shows the date when the appointment starts.</p>
<p>&nbsp;</p>
<p>Objects of type <tt>LocalDateTime</tt> can be compared to see which is first: the meaning of <tt>dateTime1.isBefore(dateTime2)</tt> and <tt>dateTime1.isAfter(dateTime2) </tt>should be obvious but you can see <a href="http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html" target="_blank" rel="noreferrer">API page for LocalDateTime</a></p>
<p>&nbsp;</p>
<p>Provide a method <tt>public boolean endsBefore(CalendarItem other)</tt> that returns the value of <tt>end.isBefore(other.start)</tt></p>
<p>&nbsp;</p>
<p>Provide a method <tt>public boolean startsAfter(CalendarItem other)</tt> that returns the value of <tt>start.isAfter(other.end)</tt></p>
<p>&nbsp;</p>
<p>Add the following 2 methods:</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">boolean</span><span class="pln"> noTimeConflictWith</span><span class="pun">(</span><span class="typ">CalendarItem</span><span class="pln"> other</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="kwd">return</span><span class="pln"> endsBefore</span><span class="pun">(</span><span class="pln">other</span><span class="pun">)</span><span class="pln"> </span><span class="pun">||</span><span class="pln"> startsAfter</span><span class="pun">(</span><span class="pln">other</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span><span class="pln">	
</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">boolean</span><span class="pln"> hasTimeConflictWith</span><span class="pun">(</span><span class="typ">CalendarItem</span><span class="pln"> other</span><span class="pun">)</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="kwd">return</span><span class="pln"> </span><span class="pun">!</span><span class="pln">noTimeConflictWith</span><span class="pun">(</span><span class="pln">other</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>Write test cases in the main method above with various <tt>CalendarItems</tt>, checking cases where they do overlap in time and cases where they do not overlap.</p>
<p>&nbsp;</p>
<p>Write a class that starts:</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">package</span><span class="pln"> assignment03</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">import</span><span class="pln"> java</span><span class="pun">.</span><span class="pln">time</span><span class="pun">.</span><span class="typ">LocalDateTime</span><span class="pun">;</span><span class="pln">
</span><span class="kwd">import</span><span class="pln"> java</span><span class="pun">.</span><span class="pln">util</span><span class="pun">.</span><span class="typ">Optional</span><span class="pun">;</span><span class="pln">

</span><span class="kwd">public</span><span class="pln"> </span><span class="kwd">class</span><span class="pln"> </span><span class="typ">CalendarList</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
&nbsp;&nbsp; &nbsp;</span><span class="kwd">private</span><span class="pln"> </span><span class="typ">CalendarItem</span><span class="pln"> first</span><span class="pun">;</span><span class="pln">
&nbsp;&nbsp; &nbsp;</span><span class="kwd">private</span><span class="pln"> </span><span class="typ">CalendarItem</span><span class="pln"> </span><span class="kwd">next</span><span class="pun">;</span><span class="pln">
</span></pre>
<p>&nbsp;</p>
<p>The idea is that <tt>first</tt> is the beginning of a linked list of nodes, which are <tt>CalendarItems,</tt> and <tt>next</tt> is the next appointment coming up (previous <tt>CalendarItems</tt> before<tt> next</tt> in the list are those that are already past).</p>
<p>&nbsp;</p>
<p>We will assume that all the code will ensure that the linked list of <tt>CalendarItems</tt> are in the correct time sequence, going from the earliest appointments to the latest (treat <tt>CalendarItem</tt> and appointment as meaning the same).</p>
<p>&nbsp;</p>
<p>The method call <tt>LocalDateTime.now()</tt> gives an object with the current date and time. We will call this the <strong>"now object"</strong>. Use this object in the following method</p>
<p>&nbsp;</p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">public</span><span class="pln"> </span><span class="kwd">void</span><span class="pln"> setNext</span><span class="pun">()</span></pre>
<p>which runs through all the<tt> CalendarItems</tt> in the linked list, starting at <tt>first</tt> and sets next to reference the<em> first</em> <tt>CalendarItem</tt> that has a start in the future or is right now (use isEqual || isAfter the "now object"). <strong>NOTE this will involve adding a method isEqual to CalendarItem that checks (say) that the startTimes are the same. It also involves turning the "now object" into a "nowItem" by setting the start and end of nowIem to the now object. If you have solved this a different way, then stay with your method.</strong></p>
<p>&nbsp;</p>
<p><strong>YOU CANNOT USE (start == other.start) TO COMPARE DATES. With any reference type, there are only very few special cases where == will work; it WILL NOT work here. You need to use (start.equals(other.start)) or <strong>(start.isEqual(other.start))</strong></strong></p>
<p>&nbsp;</p>
<p>Write a method <tt>public void resetFirst()</tt>, which first calls <tt>setNext()</tt> and then sets <tt>first</tt> to<tt> next.</tt></p>
<p>&nbsp;</p>
<p>This operation wipes out the history of past appointments.</p>
<p>&nbsp;</p>
<p>Write a method <tt>public Optional&lt;CalendarItem&gt; findConflict(CalendarItem newItem)</tt>, which loops through the whole list until it finds a <tt>CalendarItem</tt> in the list that has a time conflict with <tt>newItem</tt> (use <tt>hasTimeConflictWith</tt> in <tt>CalendarItem</tt>)</p>
<p>Return <tt>Optional.empty()</tt> if there are no conflicts.</p>
<p>You run through a list using <tt>temp = first</tt>, checking <tt>temp</tt> and then <tt>while(temp.getNextItem() != null)</tt> set <tt>temp = temp.getNextItem()</tt> and checking <tt>temp</tt>.</p>
<p>&nbsp;</p>
<p>Write a method <tt>private void insert(CalendarItem newItem)</tt>, which will insert a new appointment in the list of appointments assuming there are no time conflicts. It is <em>private</em> because it can only be called from the <tt>insertItem</tt> method below that checks for conflicts before calling this one. <strong>If first is null, then this means the CalendarList is empty, so we set first equal to newItem and then return. </strong>If <tt>newItem endsBefore first,</tt> then set the <tt>nextItem</tt> of <tt>newItem</tt> to <tt>first</tt> and change <tt>first</tt> to be<tt> newItem</tt>. Otherwise loop through the list with a<tt> temp</tt> variable until <tt>newItem endsBefore temp.getNextItem</tt>. At that point set the <tt>nextItem</tt> of <tt>newItem</tt> to <tt>temp.getNextItem</tt> and change the <tt>nextItem</tt> of <tt>temp</tt> to <tt>newItem</tt>.&nbsp;<strong>&nbsp;</strong></p>
<p>&nbsp;</p>
<p>Write a method <tt>public void insertItem(CalendarItem newItem)</tt>, to insert a new appointment but checks for conflicts or other problems. <strong>If</strong> <tt>first</tt> <strong>is not</strong> <tt>null</tt>, it first calls setNext(). It then gets the "now object" and</p>
<p>if newItem ends before the nowObject throw new IllegalArgumentException("It is too late for that appointment");</p>
<p>if newItem starts before the nowObject throw new IllegalArgumentException("That appointment is under way--run!");</p>
<p><strong>If</strong> <tt>first</tt> <strong>is not</strong> <tt>null</tt>: <strong>get</strong> <tt>Optional&lt;CalendarItem&gt; temp = findConflict(newItem);</tt></p>
<pre style="white-space: -moz-pre-wrap;white-space: -o-pre-wrap;white-space: pre-wrap;word-wrap: break-word;" class="prettyprint"><span class="kwd">if</span><span class="pun">(</span><span class="pln">temp</span><span class="pun">.</span><span class="pln">isPresent</span><span class="pun">())</span><span class="pln"> </span><span class="pun">{</span><span class="pln">
	</span><span class="kwd">throw</span><span class="pln"> </span><span class="kwd">new</span><span class="pln"> </span><span class="typ">IllegalArgumentException</span><span class="pun">(</span><span class="str">"You have a conflict. "</span><span class="pln">
	</span><span class="pun">+</span><span class="pln"> </span><span class="str">"Please use findConflict to find the conflicting appointment"</span><span class="pun">);</span><span class="pln">
</span><span class="pun">}</span></pre>
<p>After all these checks are passes you can call <tt>insert(newItem)</tt>.</p>
<p><strong><em>Note that you do not need an "else" after throwing an exception.</em></strong></p>
<p>&nbsp;</p>
<p>Write methods <tt>public void printNext()</tt>, which prints just the next <tt>CalendarItem</tt> (it will automatically use the toString of CalendarItem) and public void printCalendar(), which loops through all the <tt>CalendarItems</tt> starting at <tt>first</tt> and prints each one.</p>
<p>&nbsp;</p>
<p>Write a class <tt>CalendarTester</tt> with a main method containing lots of tests.</p>
<p>&nbsp;</p>
<p><strong>TESTING: We found it will help to have a package private method, say <tt>void testingInsert(CalendarItem)</tt>, which has the conflict test but not the test comparing with "now" to, so that it allows insertion of appointments in the past. We need this to test resetFirst: we want to have a bunch of appointments in the past that can be thrown away after calling resetFirst. (A package private method is one that is not public, private, or protected and is only visible form other classes in the same package.)</strong></p><br></div>
<div data-pats="folders" class="post_region_folders">
  <span>
    <span data-pats="folders_item"><a data-pats="link" href="#" class="tag folder" onclick="PEM.fire('filterFeed', {filter:'folder',folder:'assignment3'});return false;">assignment3</a></span>
  </span>
</div>
<div class="attachments" style="display:none;">
  <div class="attachments_divider"></div>
  <div class="attachments_count">Attachments:</div>
  <table class="attachments_list">
    
  </table>
</div>

