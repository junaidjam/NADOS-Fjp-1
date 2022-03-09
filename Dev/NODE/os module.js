const os = require("os");

// returns the underlying architecture.
let mySystemArch  = os.arch();
console.log(mySystemArch);

//return information on the cpu
let mycpuinfo = os.cpus();
console.log(mycpuinfo);

// returns the host name of the operating system as a string.
let hostname = os.hostname();
console.log(hostname);

//return operating system as a string
console.log(os.release());

//return the total amount of system memory in bytes as an integer
console.log(os.totalmem());

//return the system uptime in number of seconds.
console.log(os.uptime());

//return information about the currently effective user,
console.log(os.userInfo());

//return the platform node js compliled for.
console.log(os.platform());

//return the operating system name
console.log(os.type());





