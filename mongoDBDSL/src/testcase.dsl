DBModel {
    collections [
        Collection "MarvelCollection" {
            fields {
                Field "MovieName" : String
                Field "IMDBRating" : Number
                Field "Duration" : Number
                Field "genres" : Array<String>
            }
            indexes {
                Index "NameRatingIdx" : { "MovieName", "IMDBRating"}
            }
        }
        Collection "DCCollection" {
            fields {
                Field "MovieName" : String
                Field "IMDBRating" : Number
                Field "Duration" : Number
                Field "genres" : Array<String>
            }
            indexes {
                Index "NameRatingIdx" : { "MovieName", "IMDBRating" }
            }
            seedData "MarvelCollection" {
        		MarvelDataArray1 {
            		"MovieName" : {"IronMan", String}
                    "IMDBRating" : {8.1, Number}
                    "Duration" : {128, Number}
        		}
    		}
        }
    ]
  
}