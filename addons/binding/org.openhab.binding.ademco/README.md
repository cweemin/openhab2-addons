# <bindingName> Ademco

This binding allows OpenHab2 to communicate with the Honeywell's Ademco Vista 15/20p security panel through the EyezOn Envisalink 4/3 adapter. This binding is model after the existing DSC Alarm Binding with a few modification. 

## Supported Things

| Thing      | Thing Type | Description                                                            |
|--------------------------------------------------------------------------------------------------|
| envisalink | Bridge     | The eyezon Envisalink 4/3 interface.                                   |
| partition  | Bridge     | Represents a controllable area within a DSC Alarm system.              |
| zone       | Thing      | Represents a physical device such as a door, window, or motion sensor. |
## Discovery

TODO: Not yet implemented.

## Binding Configuration

No configuration needed for the binding.

## Thing Configuration

The envisalink is the main bridge follows by the partition bridge and finally the zone things.

<table>
<tr><th>Thing/Bridge</th><th>Configuration</th></tr>
<tr><td>envisalink</td><td><table><tr><td><b>ipAddress</b> - IP address for the Envisalink adapter - Required.</td></tr><tr><td><b>port</b> - TCP port for the Envisalink adapter - Not Required - default = 4025.</td></tr><tr><td><b>password</b> - Password to login to the Envisalink bridge - Required.</td></tr><tr><td><b>connectionTimeout</b> - TCP socket connection timeout in milliseconds - Not Required - default=5000.<br/></td></tr><tr><td><b>pollPeriod</b> - Period of time in minutes between the poll command being sent to the Envisalink bridge - Not Required - default=1.</td></tr></table></td></tr>
</table>

_Note that it is planned to generate some part of this based on the XML files within ```ESH-INF/thing``` of your binding._

## Channels

_Here you should provide information about available channel types, what their meaning is and how they can be used._

_Note that it is planned to generate some part of this based on the XML files within ```ESH-INF/thing``` of your binding._

## Full Example

_Provide a full usage example based on textual configuration files (*.things, *.items, *.sitemap)._

## Any custom content here!

_Feel free to add additional sections for whatever you think should also be mentioned about your binding!_
