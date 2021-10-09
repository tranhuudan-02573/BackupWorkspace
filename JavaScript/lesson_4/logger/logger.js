
// export kieu thuong duoc phep vo so cai

import {
    TYPE_LOG,
 } from '../constant.js'
function logger(log, type = 'log') {
    console[type](log);
}
// chi duoc export default 1 cai thoi
export default logger;
