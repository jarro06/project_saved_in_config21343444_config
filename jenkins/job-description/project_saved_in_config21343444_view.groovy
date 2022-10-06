 
listView('project_saved_in_config21343444 Jobs') {
    description('project_saved_in_config21343444 Jobs')
    jobs {
        regex('project_saved_in_config21343444_.+')
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
