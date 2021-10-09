// modules import / export
// con import kieu nay la export default

// import logger from './logger/index.js'

// import tu default chuyen sang thuong
import {logger2} from './logger/index.js'
// import kieu nay la export constant
import {
    TYPE_LOG,
TYPE_ERROR,
    TYPE_WARN
} from './constant.js'

// logger('test message','error')

// logger('test message', TYPE_WARN)

import * as constans from './constant.js'

//  logger('test message', constans.TYPE_ERROR)
logger2('test message', constans.TYPE_ERROR)
