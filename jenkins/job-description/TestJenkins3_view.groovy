 
listView('TestJenkins3 Jobs') {
    description('TestJenkins3 Jobs')
    jobs {
        regex('TestJenkins3_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
