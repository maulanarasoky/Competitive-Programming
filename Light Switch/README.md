# Light Switch

There are N buttons numbered from 1 to N and a lamp is turned off.
When the keyl button is pressed, the lamp will change (from dead to lit, or
otherwise) if N is divisible by i. When each button is pressed right
once, how about the lights in the end ?

### Format Input
A line contains a number, namely N.

### Format Output
A line contains:
- "lights off", when the end of the lamp is off.
- "lights on", when the end of the light is on.

### Input Example 1
> 5

### Output Example 1
> Lights Off

### Input Example 2
> 4

### Output Example 2
> Lights On

### Explanation
In the first example, the button that affects the state of the lamp is button 1 and
button 5. Pressing button 1 causes the lights to turn on, and presses
button 5 returns it to a dead state.
