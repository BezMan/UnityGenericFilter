package com.example.unityapp.utils

class Consts {
    companion object {
        val jsonRaw = """
            {
                "articles":
                [
                    {
                        "title": "Praful Patel & Kushal Das congratulate Gokulam Kerala on winning the 2021/22 I-League title",
                        "description": "Praful Patel & Kushal Das congratulate Gokulam Kerala on winning the 2021/22 I-League title",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://images2.minutemediacdn.com/image/upload/c_crop,w_1080,h_607,x_0,y_0/c_fill,w_912,ar_16:9,f_auto,q_auto,g_auto/images/voltaxMediaLibrary/mmsport/90min_en_international_web/01g361j6eh0vzwcmr1m7.webp",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Arcade Fire Blasts to No. 1 In U.K. With ‘WE’",
                        "description": "Arcade Fire's \"We\" debuts at No. 1 on the Official U.K. Albums Chart, matching the efforts of 2010’s \"The Suburbs,\" 2013’s \"Reflektor\" and 2017’s \"Everything Now.\"",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.billboard.com/wp-content/uploads/2022/03/arcade-fire-nyc-ukraine-benefit-2022-billboard-1548.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Ivan Toney & Rico Henry say families were racially abused at Everton",
                        "description": "Brentford players Ivan Toney & Rico Henry have both said that family members were racially abused during Premier League clash with Everton at Goodison Park.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://images2.minutemediacdn.com/image/upload/c_crop,w_1920,h_1080,x_0,y_0/c_fill,w_912,ar_16:9,f_auto,q_auto,g_auto/images/voltaxMediaLibrary/mmsport/90min_en_international_web/01g35zay5cfega40a934.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Johnson says UK will act on N. Ireland rules if EU won't",
                        "description": "Johnson says UK will act on N. Ireland rules if EU won't",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/d691e9e9a0a1c5c3ef71a98a07334ba9",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Kim blasts pandemic response as North Korean outbreak surges",
                        "description": "Kim blasts pandemic response as North Korean outbreak surges",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/67e0b5093d66125242ddb3f00f44b690",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Maryland's Sen. Chris Van Hollen treated for minor stroke",
                        "description": "Maryland's Sen. Chris Van Hollen treated for minor stroke",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/42b711b4a398083c787bf4ed5ebd8e9f",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Jim Acosta calls out Tucker Carlson, Fox News for profiting off white supremacy",
                        "description": "\"What Tucker Carlson is doing ... in peddling white nationalist talking points is dangerous,\" says CNN's Acosta",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2019/07/jim-acosta.jpg",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Shanghai says lockdown to ease as virus spread mostly ends",
                        "description": "Shanghai says lockdown to ease as virus spread mostly ends",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/81cc24e17c09ca13139ba50e986c2d92",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Live updates | EU diplomat says no guarantee on oil embargo",
                        "description": "Live updates | EU diplomat says no guarantee on oil embargo",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/8b040a286b808cf1c8465fd666ad0435",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Russian war effort runs into diplomatic, military hurdles",
                        "description": "Russian war effort runs into diplomatic, military hurdles",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/6dc968ea8d353132bd8b8cb58b04734c",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Gaudreau's OT goal gives Flames 3-2 win over Stars in Game 7",
                        "description": "Gaudreau's OT goal gives Flames 3-2 win over Stars in Game 7",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/10a1ee4a99ea8b60e1d118fb9e121cc7",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "John Oliver Explains Why Your Electric Bill Is So Damn High",
                        "description": "Utility companies gouge consumers, provide substandard service, and even kill people. Yet they seldom pay any meaningful penalties for their negligence.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.rollingstone.com/wp-content/uploads/2022/02/john-oliver.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "16 Things You Didn’t See on TV at the 2022 Billboard Music Awards",
                        "description": "The most interesting moments that didn't make the live feed of the 2022 BBMAs.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.billboard.com/wp-content/uploads/2022/05/Janet-Jackson-bbma-show-2022-billboard-1548.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Rangers-Canes, Battle of Alberta up next in NHL playoffs",
                        "description": "Rangers-Canes, Battle of Alberta up next in NHL playoffs",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/eea09883c3d17a2c54fce7f87a0bd1cf",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Gunman Hogtied With Extension Cord By Congregants In Deadly California Church Shooting",
                        "description": "Gunman, said to be an Asian man in his 60s, opened fire at a Taiwanese church in southern California Sunday before he was overpowered by churchgoers showing \"exceptional heroism,\" police said",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.rollingstone.com/wp-content/uploads/2022/05/AP22135848534947.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "2022 Billboard Music Awards ceremony honors Doja Cat, Megan Thee Stallion, Glass Animals …",
                        "description": "Most of the 2022 Billboard Music Awards winners were announced hours before the show, including a historic third Top Artist victory for rapper Drake that made him the all-time most awarded musician in that category. But several trophies were still bestowed amid more than a dozen performances during the ceremony that aired at 8:00pm Eastern/5:00pm […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.goldderby.com/wp-content/uploads/2022/05/doja-cat-bbmas-2022.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Lawyer charged with lying to FBI in Russia probe faces trial",
                        "description": "Lawyer charged with lying to FBI in Russia probe faces trial",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/1e5fdca26bbb6d5aab9e5027f67c76b0",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "2022 midterms: What to watch as 5 states hold primaries",
                        "description": "2022 midterms: What to watch as 5 states hold primaries",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/310e0fd81abf19c11bf0fae84d117d13",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Biden's leadership of Democrats faces test in next primaries",
                        "description": "Biden's leadership of Democrats faces test in next primaries",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/422887103b5fc9178b4b8a020c59cf91",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Burna Boy Drums Up “Last Last” And “Kilometre” For His Billboard Music Awards Debut",
                        "description": "It is the first time the Nigerian superstar performed at the event.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.vibe.com/wp-content/uploads/2022/05/Burna-Boy-Billboard-Music-Awards-Performance.jpeg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Billboard Music Awards 2022 winners: Best prediction scores by our Users and Editors",
                        "description": "Congratulations to our User Deto for an excellent score of 86.67% (13 of 15 correct) when predicting the 2022 Billboard Music Awards winners on Sunday. Our top scorer is just ahead of nine people at 80.005 and has a great point score of 17,285 by using the two Super Bets (500 points each) wisely. Over […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.goldderby.com/wp-content/uploads/2022/05/Billboard-Music-Awards-Predictions-Score-Report.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "2022 Billboard Music Awards winners list: BBMAs results in all 62 categories",
                        "description": "The Billboard Music Awards were held on Sunday night, May 15, honoring the biggest hits in music. Like the fan-voted VMAs or American Music Awards, this event is more or less a popularity contest, but listeners didn’t get to vote directly for the winners. Instead, these awards celebrate Billboard chart achievements based on album and […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.goldderby.com/wp-content/uploads/2022/05/sean-diddy-combs-billboard-music-awards-2022.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Shanghai aims for return to normal life from June 1",
                        "description": "Shanghai aims for return to normal life from June 1",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N2043",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Fritz Hager or Nicolina: Whose ‘American Idol’ elimination was more shocking? [POLL]",
                        "description": "In the penultimate episode of “American Idol” 2022, two fan-favorite singers were cut from the competition in fourth/fifth place: Fritz Hager and Nicolina. (Read our minute-by-minute live blog to see how it all went down.) Between 22-year-old Fritz and 18-year-old Nicolina, whose “American Idol” elimination was more shocking on Sunday, May 15? Vote in our […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.goldderby.com/wp-content/uploads/2022/05/american-idol-fritz-nicolina.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Poor workers bear the brunt of India's heatwave",
                        "description": "Poor workers bear the brunt of India's heatwave",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N2029",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "China reports 1,227 new COVID cases for May 15 vs 1,789 a day earlier",
                        "description": "China reports 1,227 new COVID cases for May 15 vs 1,789 a day earlier",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N2021",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Nietzsche foresaw how technology can make us miserable — and has a prescription to correct that",
                        "description": "\"In Emergency, Break Glass\" author Nate Anderson says the German philosopher can help us live more fulfilled lives",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2022/05/nietzsche-on-a-phone-0506221.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Russia risks speed up automakers' switch from palladium to platinum, WPIC says",
                        "description": "Russia risks speed up automakers' switch from palladium to platinum, WPIC says",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10NH",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Residents of Ukraine's Kalush in \"seventh heaven\" after home band wins Eurovision",
                        "description": "Residents of Ukraine's Kalush in \"seventh heaven\" after home band wins Eurovision",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10M7",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "JoJo Fletcher & Jordan Rodgers & More Celebrities Who Got Married in 2022",
                        "description": "2021 was a whirlwind of a year for our favorite celebrity couples. But with all the shocking proposals from 2021 come extravagant weddings we’re dying to see in 2022. (Hint: we can’t wait for that punk-rock Kourtney Kardashian and Travis Barker wedding). But the 2020s have been nothing short of crazy, between the COVID-19 pandemic […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.sheknows.com/wp-content/uploads/2022/05/calebrity-wedding-20222.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "This 7-in-1 Cleaner Is Designed To Get Every Surface In Your Home & Customers Are Raving About Its Effectiveness",
                        "description": "Sometimes we feel like Monica Geller in Friends, grabbing every cleaning product we can get to make our homes spotless. From brooms to mops, it’s getting cluttered and we’re losing track of what to use for what. So we’ve been looking for the most powerful and easy-to-use cleaning tools to make our lives easier. And […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.sheknows.com/wp-content/uploads/2022/05/scrubber2.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Former Somali leader Mohamud wins presidency again",
                        "description": "Former Somali leader Mohamud wins presidency again",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N1002",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Democratic U.S. Senate hopeful Fetterman says he suffered stroke",
                        "description": "Democratic U.S. Senate hopeful Fetterman says he suffered stroke",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10JE",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Soccer-Milan close in on first Serie A title in 11 years after win over Atalanta",
                        "description": "Soccer-Milan close in on first Serie A title in 11 years after win over Atalanta",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10I9",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Queen Elizabeth attends star-studded horse show finale",
                        "description": "Queen Elizabeth attends star-studded horse show finale",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10K1",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Buffalo shooting comes eight months after Rep. Elise Stefanik called out over \"Great Replacement\"",
                        "description": "Powerful upstate N.Y. congresswoman apparently used \"replacement\" rhetoric similar to Buffalo shooter's manifesto",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2021/05/gettyimages-1317980815.jpg",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Soccer-Premier League talking points",
                        "description": "Soccer-Premier League talking points",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10IY",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Is Paxlovid, the COVID pill, reaching those who most need it? The government won’t say",
                        "description": "Officials won't say how many people have received antiviral pills, or if they're being equitably distributed",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2022/05/paxlovid-051522.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Biden balances anti-crime and reform agendas in message to police",
                        "description": "Biden balances anti-crime and reform agendas in message to police",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10IE",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "McConnell sees Wednesday U.S. Senate vote on ${'$'}40 billion Ukraine aid bill",
                        "description": "McConnell sees Wednesday U.S. Senate vote on ${'$'}40 billion Ukraine aid bill",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10EM",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Zoom birth doulas became popular during the pandemic. Now, many still prefer the virtual touch",
                        "description": "Many expectant mothers prefer the convenience of having their birth doula video-chat into the delivery room",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2022/05/pregnant-woman-on-phone-in-hospital-0513221.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Ukrainian troops holding destroyed village believe Russians withdrawing across border",
                        "description": "Ukrainian troops holding destroyed village believe Russians withdrawing across border",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10HP",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Mass shooting in Buffalo: Tucker Carlson and other right-wing conspiracy theorists share the blame",
                        "description": "Fox News and GOP leaders understood the \"great replacement\" conspiracy theory was dangerous — and pushed it anyway",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2022/05/gettyimages-1240669575.jpg",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Swiss voters approve 'Lex Netflix' TV streaming funding law",
                        "description": "Swiss voters approve 'Lex Netflix' TV streaming funding law",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N1093",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Sweden's security needs best served by NATO membership, PM says",
                        "description": "Sweden's security needs best served by NATO membership, PM says",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10GH",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Germany's conservatives set to win election in key state - exit polls",
                        "description": "Germany's conservatives set to win election in key state - exit polls",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N10G8",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Buddhist chaplains on the rise in US, offering broad appeal",
                        "description": "Buddhist chaplains on the rise in US, offering broad appeal",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/b700bfe52805676859b1eee8475deea2",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Opponents of Jerusalem cable car plan lose Supreme Court case",
                        "description": "Opponents of Jerusalem cable car plan lose Supreme Court case",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N105V",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Falcons Acquire Wideout Bryan Edwards in a Trade with Las Vegas",
                        "description": "On Friday, the Atlanta Falcons added to their wide receiver corps by making a trade with the Las Vegas Raiders for the third-year wideout Bryan Edwards. In order to get their man, the Falcons sent a 2023 fifth-rounder to Las Vegas. As part of the deal, Atlanta is also getting a seven-round selection. Edwards, who […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://sportzbonanza.com/wp-content/uploads/2022/05/shutterstock_editorial_12452562ba-scaled.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "LA Chargers Break the Internet With Their Schedule Release",
                        "description": "The NFL teams have become increasingly creative over the years with how they announce their schedules for the upcoming season. However, the Los Angeles Chargers’ schedule release for the 2022 NFL season will be hard to top. The Chargers released their schedule for the upcoming season as an anime-style video. The two-minute clip is filled […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://sportzbonanza.com/wp-content/uploads/2022/05/zweaccuuyw4iwu4imv01.webp",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "The secrets to passing climate legislation — even in red states",
                        "description": "These Republican states are passing clean energy bills in the name of freedom and economics",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2021/04/carbon-dioxide-emissions-0408211.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Man Ray’s Famed Photograph of Kiki de Montparnasse Sells for Record ${'$'}12.4 M.",
                        "description": "The result was over three times the previous auction record for a photograph.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.artnews.com/wp-content/uploads/2022/02/Screen-Shot-2022-02-15-at-3.02.28-PM.png",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": " French scientist leading nuclear fusion project dies at 72 ",
                        "description": " French scientist leading nuclear fusion project dies at 72 ",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/30367b0caf8fcb380d3c4054b4eab613",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Nigeria's markets regulator publishes rules on crypto assets",
                        "description": "Nigeria's markets regulator publishes rules on crypto assets",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2N008S",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "San Diego Padres sign All-Star infielder Robinson Cano",
                        "description": "The San Diego Padres signed veteran infielder Robinson Cano on Friday, the team announced.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://cdnph.upi.com/ph/st/th/4161652496516/2022/upi/a59076878274c953062bd3e650bb2704/v1.5/San-Diego-Padres-sign-All-Star-infielder-Robinson-Cano.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Menaced by flames, nuclear lab peers into future of wildfire",
                        "description": "Menaced by flames, nuclear lab peers into future of wildfire",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/ca71db6ea9b65c744d398e524444cce8",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Musk says ${'$'}44 billion Twitter deal on hold over fake account data",
                        "description": "Musk says ${'$'}44 billion Twitter deal on hold over fake account data",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ0PE",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "SpaceX launches Starlink satellites from California",
                        "description": "SpaceX launches Starlink satellites from California",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/bf47d8ccd1fb808aba7bfeb05eb5eacd",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Used-car retailer Carvana sees significant core earnings for 2023",
                        "description": "Used-car retailer Carvana sees significant core earnings for 2023",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1UT",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Trevali says caught unawares by downpour that flooded Burkina mine",
                        "description": "Trevali says caught unawares by downpour that flooded Burkina mine",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1R6",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Why Experts Say Kim Kardashian Shouldn’t Have Worn Marilyn Monroe Dress at Met Gala",
                        "description": "Kim Kardashian turned heads earlier this month when she appeared at the Met Gala, the annual celebrity event that raises funds for the Metropolitan Museum of Art’s Costume Institute, wearing a historic gown custom made for Marilyn Monroe. It was the dress that Monroe wore at Madison Square Garden on May 19, 1962, when she […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.artnews.com/wp-content/uploads/2022/05/KimKardashianMetGala.jpeg",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Colombia's TuHabi, latest property tech 'unicorn,' touts ${'$'}200 million funding",
                        "description": "Colombia's TuHabi, latest property tech 'unicorn,' touts ${'$'}200 million funding",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1S1",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Ex-nurse sentenced to probation in patient medication death",
                        "description": "Ex-nurse sentenced to probation in patient medication death",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/1e196d4e4358a20141385494426cdbe7",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Liao Wen’s Dislocated Bodies",
                        "description": "A Chinese sculptor twists and stylizes figures to echo Greek myth and contemporary social displacement.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.artnews.com/wp-content/uploads/2022/05/CapsuleShanghai_LW_AlmostCollapsingBalance_InstallationShot_23kb.jpg",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Egypt to be among first to issue new climate targets ahead of U.N. summit",
                        "description": "Egypt to be among first to issue new climate targets ahead of U.N. summit",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1PE",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Twitter executive changes aimed at building 'a stronger Twitter', CEO says",
                        "description": "Twitter executive changes aimed at building 'a stronger Twitter', CEO says",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1ON",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Lincoln Center’s David Geffen Hall Renovation Will Open with Massive Public Art by Nina Chanel Abney and Jacolby Satterwhite",
                        "description": "The artists plan to address the neighborhood's fraught history with gentrification.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://www.artnews.com/wp-content/uploads/2022/05/mhi78bkg1e86pdsz7nzu.jpeg",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "ER wait times longer for Hispanic people with chest pain, study finds",
                        "description": "Hispanic adults in the United States who visit hospital emergency rooms with chest pain wait longer to receive treatment than those of other racial and ethnic groups, a study presented Friday found.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://cdnph.upi.com/ph/st/th/5991652460674/2022/upi_com/2002b4a72bffeecb73e95a6ac8e72baa/v1.5/ER-wait-times-longer-for-Hispanic-people-with-chest-pain-study-finds.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Character actor Fred Ward, known for role in 'The Right Stuff,' dead at age 79",
                        "description": "Character actor Fred Ward, known for role in 'The Right Stuff,' dead at age 79",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1JQ",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Chile's climate scientist minister eyes tougher rules for top copper mining nation",
                        "description": "Chile's climate scientist minister eyes tougher rules for top copper mining nation",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1IX",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Royal Society names climate scientist first Brazilian member since 1800s",
                        "description": "Royal Society names climate scientist first Brazilian member since 1800s",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1H8",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "TIM signs network-sharing deal with Open Fiber to speed up rollout",
                        "description": "TIM signs network-sharing deal with Open Fiber to speed up rollout",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ1HO",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Antibiotics may raise risk for inflammatory bowel disease in older adults, study finds",
                        "description": "The risk for inflammatory bowel disease among adults age 60 and older rises with the number of antibiotics they are prescribed, a study presented Friday found.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://cdnph.upi.com/ph/st/th/8481652456043/2022/upi_com/eed159a4bb6bc6768c88f54e0c22976b/v1.5/Antibiotics-may-raise-risk-for-inflammatory-bowel-disease-in-older-adults-study-finds.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Oil development in Canada is impacting wildlife",
                        "description": "Oil drilling in Canada’s boreal forest has altered interactions between wolves, caribou, bears, and other species",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2021/04/pack-of-gray-wolves-0415211.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Hong Kong's Q1 GDP shrinks 4% y/y",
                        "description": "Hong Kong's Q1 GDP shrinks 4% y/y",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ0LR",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "China denies suspending passports, invalidating foreign residency cards",
                        "description": "China denies suspending passports, invalidating foreign residency cards",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ07X",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Nissan says it is too early to predict EV unit spin-off",
                        "description": "Nissan says it is too early to predict EV unit spin-off",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MZ05J",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Sources: Hyundai to set ${'$'}7B US plant during Biden Asia visit",
                        "description": "Sources: Hyundai to set ${'$'}7B US plant during Biden Asia visit",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/666958feb8c2dc66015f784603edae8c",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Symptoms linger two years for some; inflammatory protein patterns may provide long COVID clues",
                        "description": "Symptoms linger two years for some; inflammatory protein patterns may provide long COVID clues",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MY22M",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "GM agrees to hike wages 8.5% at major Mexico plant, union says",
                        "description": "GM agrees to hike wages 8.5% at major Mexico plant, union says",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MY20Q",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Scientists succeed for first time growing plants in soil from the moon",
                        "description": "Scientists have managed to grow plants in lunar soil for the first time ever, setting the stage for astronauts to potentially grow their own food on the moon during future missions.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://cdnph.upi.com/ph/st/th/4861652375775/2022/i/16523794114315/v1.5/Scientists-succeed-for-first-time-growing-plants-in-soil-from-the-moon.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Scientists unveil image of 'gentle giant' black hole at Milky Way's center",
                        "description": "Scientists unveil image of 'gentle giant' black hole at Milky Way's center",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MY0X8",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Event Horizon Telescope unveils image of black hole at center of Milky Way",
                        "description": "Astronomers who work on the Event Horizon Telescope project revealed the first-ever image of the supermassive black hole in the heart of the Milky Way galaxy.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://cdnph.upi.com/ph/st/th/8661652323466/2022/upi_com/2b22de8c8628981f56fb5892453b0b2d/v1.5/Event-Horizon-Telescope-unveils-image-of-black-hole-at-center-of-Milky-Way.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Renault expects first hydrogen utility sales in Germany and Netherlands soon, executive says",
                        "description": "Renault expects first hydrogen utility sales in Germany and Netherlands soon, executive says",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MY1GX",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Russia needs de-Nazification, says Pussy Riot leader after escape",
                        "description": "Russia needs de-Nazification, says Pussy Riot leader after escape",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MY1FQ",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Lordstown Motors shares surge after it sells assets to Foxconn",
                        "description": "Lordstown Motors shares surge after it sells assets to Foxconn",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MY194",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Japan's SoftBank sinks to losses as investments sour  ",
                        "description": "Japan's SoftBank sinks to losses as investments sour  ",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/b1dabb2432d97a8765e0a587e300fe54",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Indian citizens, students now eligible for booster shot, health min says",
                        "description": "Indian citizens, students now eligible for booster shot, health min says",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MY0PI",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Tourists return to Paris post-pandemic but Asians, Americans stay away",
                        "description": "Tourists return to Paris post-pandemic but Asians, Americans stay away",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MX151",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Vietnamese photographer gives pope famous 'Napalm Girl' picture",
                        "description": "Vietnamese photographer gives pope famous 'Napalm Girl' picture",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MX1YG",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "EU commission proposes plan to fight child pornography",
                        "description": "EU commission proposes plan to fight child pornography",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/3d2f368fdcaf7e4497834acbfb2d00fa",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Healthier Ways to Enjoy Red Meat",
                        "description": "With barbecue season almost upon us, avoiding red meat is pretty much impossible. How can you say no to hamburgers, hotdogs, and steak? They’re synonymous with being American. But while these barbecue foods are delicious, they’re not the healthiest as red meat is high in saturated fat and sodium. Don’t worry—we’ve got you covered with […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://falafelandcaviar.com/wp-content/uploads/2021/07/edson-saldana-J88no2vCrTs-unsplash-scaled.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Tesla exports first cars from Shanghai since reopening plant - media",
                        "description": "Tesla exports first cars from Shanghai since reopening plant - media",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MX03H",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Vietnam's Vinfast IPO may be delayed to 2023 on market uncertainty",
                        "description": "Vietnam's Vinfast IPO may be delayed to 2023 on market uncertainty",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MX056",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Bill Gates says he has COVID, experiencing mild symptoms",
                        "description": "Bill Gates says he has COVID, experiencing mild symptoms",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/e195009329bf2e01523676325bbd3807",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Jurors in 'Fitbit murder' trial convict man of killing wife",
                        "description": "Jurors in 'Fitbit murder' trial convict man of killing wife",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/2260e9a2daed6a18709fee16ba46487d",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "726       ",
                        "description": "Thank you, hockey.",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://images2.minutemediacdn.com/image/upload/c_fill,w_912,ar_16:9,f_auto,q_auto,g_auto/shape/cover/sport/dataimagewebpbase64UklGRkLdCABXRUJQVlA4WAoAAAAgAAA-4e6bbbb5251ddfaad7ce68b76b0031e6.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Toyota to slash production plan, suspend some domestic operation due to COVID lockdown in China",
                        "description": "Toyota to slash production plan, suspend some domestic operation due to COVID lockdown in China",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MW10I",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Nintendo announces 10-1 stock split; sees Switch sales falling 9%",
                        "description": "Nintendo announces 10-1 stock split; sees Switch sales falling 9%",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MW0FK",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "EV maker Lucid to launch luxury sedans in Europe in late 2022",
                        "description": "EV maker Lucid to launch luxury sedans in Europe in late 2022",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MW0IF",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Trudeau: Canada to be good energy partner with Europe but won't compromise climate goals",
                        "description": "Trudeau: Canada to be good energy partner with Europe but won't compromise climate goals",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MU0MU",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Ukraine's mine sniffing dog Patron awarded medal by Zelenskiy",
                        "description": "Ukraine's mine sniffing dog Patron awarded medal by Zelenskiy",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MU0L4",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Animals, plants have their day in court: \"Rights of Nature\" makes a legal case for climate change",
                        "description": "Can icebergs sue fossil fuel companies? Can an ocean file a lawsuit over acidification?",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2022/05/diablo-dam-on-skagit-river-0506221.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Adrian and Gidi Turn Paper Into Magic",
                        "description": "When it comes to paper craft, Adrian Woods and Gidi van Maarseveen are the team to beat. Known collectively as Adrian & Gidi, the two are known for their playful but still refined approach toward their work, which includes craft, design, and animation. View this post on Instagram A post shared by ADRIAN & GIDI […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://tettybetty.com/wp-content/uploads/2021/05/pla-e1620312801566.jpg",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Did You Know You Can Grill These Fruits?",
                        "description": "When we thinking of grilling, typically meat, fish, and veggies come to mind. We bet you haven’t thought about grilling fruits. Some fruits are simply meant to be grilled and when they are they become caramelized and even sweeter. It’s a real treat! Here are five fruits you have to grill at your next barbecue. […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://falafelandcaviar.com/wp-content/uploads/2021/06/Depositphotos_117049632_xl-2015-scaled.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Katie Rodgers’ Paintings Are a Blend of Nature and Fashion",
                        "description": "Art seems to run in Katie Rodgers’ veins. Her aunt gifted her with her first professional set of watercolors before the age of seven, and according to Rodgers, it was love at first sight. Growing up in Georgia, Rodgers was a country girl and would often escape both outside to the garden, or inside into her own […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://tettybetty.com/wp-content/uploads/2021/05/kat-2-e1620633332100.jpg",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Activision Blizzard shareholders approve ${'$'}68.7 billion Microsoft deal",
                        "description": "Activision Blizzard shareholders approve ${'$'}68.7 billion Microsoft deal",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MK1TM",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "A 'da Vinci of violins' goes up for auction in France",
                        "description": "A 'da Vinci of violins' goes up for auction in France",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MJ0VA",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "The long complex history of oil price shocks",
                        "description": "Oil prices were steadily climbing before Russia's invasion of Ukraine",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2022/04/gas-1391172998.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Top 3 Tips for Picking Sustainable Destination for Your Next Trip",
                        "description": "As more travelers become eco-conscious and concerned about their impact on the planet, sustainable travel is slowly becoming the new normal. If you’re looking for a way to make your traveling habits more eco-friendly, it all starts with the destination that you’re going to pick, and you can make the most sustainable choice with these […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://beautifultrendstoday.com/wp-content/uploads/2022/03/annie-spratt-qyAka7W5uMY-unsplash-scaled.jpg",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Rich countries are illegally exporting plastic trash to poor countries",
                        "description": "New reports reveal \"rampant\" violations of international law",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://media.salon.com/2021/05/plastic-garbage-pollution-0519211.jpg",
                        "rating": 3,
                        "placeholderColor":
                        {
                            "red": 202,
                            "green": 118,
                            "blue": 46
                        }
                    },
                    {
                        "title": "Kyiv Symphony's European tour marks 'cultural front' in Ukraine crisis",
                        "description": "Kyiv Symphony's European tour marks 'cultural front' in Ukraine crisis",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MD1V1",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "5 Things You Shouldn’t Pack in a Carry-On Bag",
                        "description": "When getting ready for a trip, it’s important to pack your most important and valuable items in your carry-on bag. But there are some things you should never pack in your carry-on. Do you know what they are? Here are five of them. Smelly Snacks Sure we get that it’s nice to have healthy and […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://mydailymagazine.com/wp-content/uploads/2021/04/krakenimages-FywFo9bHbLo-unsplash-e1617867867350.jpg",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Japan opens biggest esports park to level up competitive gaming",
                        "description": "Japan opens biggest esports park to level up competitive gaming",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MC0YB",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Instagram User Recreates Drawings From “Friends” With a Magna Doodle",
                        "description": "Friends is one of the most iconic shows that ever graced the television. Great comedy, silly characters, and intricate storylines, this legendary sitcom had it all. It even used easter eggs before it was cool. If you watched Friends, you probably noticed a Magna Doodle hanging on the doors of Joey and Chandler’s apartment. First […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://tettybetty.com/wp-content/uploads/2021/05/131418487_1611914359003181_29579738428781201_n.jpg",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Gaming platforms FlickPlay, The Sandbox take steps toward metaverse",
                        "description": "Gaming platforms FlickPlay, The Sandbox take steps toward metaverse",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2MA0GG",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Poland's CD Projekt plans to release Cyberpunk expansion next year",
                        "description": "Poland's CD Projekt plans to release Cyberpunk expansion next year",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2M61OZ",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "CD Projekt says no 'monumental' delay to Witcher 3 next-gen release",
                        "description": "CD Projekt says no 'monumental' delay to Witcher 3 next-gen release",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2M61MB",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Remote Jobs You Can Do While Traveling",
                        "description": "Many people dream about traveling around the world, which can be hard if you have a full-time job. Luckily, there are many remote jobs you can do while traveling, and here are some of them. Virtual Assistant A virtual assistant is a person who supports clients from a remote location by scheduling their appointments, managing […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://mydailymagazine.com/wp-content/uploads/2021/06/thought-catalog-505eectW54k-unsplash-1-scaled.jpg",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Tencent to block Chinese gamers' access to foreign, unapproved games",
                        "description": "Tencent to block Chinese gamers' access to foreign, unapproved games",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2M60A1",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Sony, Nintendo pledge 'roll-over' gaming contract changes in Britain",
                        "description": "Sony, Nintendo pledge 'roll-over' gaming contract changes in Britain",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2M50SS",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "Factbox-From Dylan to Springsteen, music greats sell rights to labels",
                        "description": "Factbox-From Dylan to Springsteen, music greats sell rights to labels",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2M40YX",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Activision appoints Kristen Hines as chief diversity, equity and inclusion officer",
                        "description": "Activision appoints Kristen Hines as chief diversity, equity and inclusion officer",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2M31M3",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "China grants licences to 45 internet games in April",
                        "description": "China grants licences to 45 internet games in April",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2M30ZN",
                        "rating": 4,
                        "placeholderColor":
                        {
                            "red": 230,
                            "green": 166,
                            "blue": 16
                        }
                    },
                    {
                        "title": "'Cabaret','Life of Pi' triumph at London's Olivier Awards for theatre",
                        "description": "'Cabaret','Life of Pi' triumph at London's Olivier Awards for theatre",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/upload/q_auto,f_auto/aura-news/article_assets/KCN2M20IB",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 195,
                            "green": 186,
                            "blue": 177
                        }
                    },
                    {
                        "title": "Liz Carlson Encourages Other Women to Travel Solo",
                        "description": "If there’s one thing we’re missing in these uncertain times, it’s international travel. As we get used to a new normal, we test the waters when it comes to new traveling experiences. According to the World Travel and Tourism Council, traveler preferences and behaviors have shifted toward low risk, familiar, predictable, and trusted. Travelers are […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://tettybetty.com/wp-content/uploads/2020/10/4.jpg",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Jenny Anderson’s Lifestyle is Filled with Adventure",
                        "description": "With a moniker like Girl of 10,000 Lakes, you can expect to see plenty of water-based travels on Jenny Anderson’s Instagram page. A seasoned traveler, Anderson has an active life filled with adventure to the brim. Traveling full time with her partner and child, her vacations revolve around water and fishing. There is also plenty […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://tettybetty.com/wp-content/uploads/2020/11/l.jpg",
                        "rating": 5,
                        "placeholderColor":
                        {
                            "red": 180,
                            "green": 136,
                            "blue": 86
                        }
                    },
                    {
                        "title": "Choco and Pancake Illustrate Their Long-Distance Relationship Through Relatable Comics",
                        "description": "It’s not a secret that being in a long-distance relationship can be pretty challenging. However, if you put in the effort and care about your partner enough, you will manage to see it through and be rewarded with a special bond. People have different ways to deal with the challenges of long-distance relationships. Some are […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://tettybetty.com/wp-content/uploads/2022/02/1-1.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Wife Goes On Strike After Husband Swears He’s The One Who Cleans",
                        "description": "After her husband’s comment that he does all the cleaning, Jalie Gil decided to go on a “week-long strike on not cleaning any of his stuff because he swears to God he is the one cleaning.” She also began capturing everything on camera and posting it onto her TikTok account. The 27-year-old Florida-based woman has […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://tettybetty.com/wp-content/uploads/2021/09/13.jpg",
                        "rating": 1,
                        "placeholderColor":
                        {
                            "red": 176,
                            "green": 119,
                            "blue": 97
                        }
                    },
                    {
                        "title": "Doctor Takes Flowers from Strangers’ Weddings and Gives Them to Her Patients",
                        "description": "Virginia-based doctor Eleanor Love dedicates her life to helping medical patients. And this doesn’t include just treating them from illnesses and injuries. She also tries to bring a smile to their face by giving them flowers. View this post on Instagram A post shared by Eleanor Love (@eleanor_54) Love started this heartwarming habit while she […]",
                        "image_url": "https://cloudinary-res-news.isappcloud.com/image/fetch/q_auto,f_auto//https://tettybetty.com/wp-content/uploads/2021/07/123286695_635715437097546_8228544822423964647_n-e1627892948632.jpg",
                        "rating": 2
                    }
                ]
            }
        """.trimIndent()
    }
}