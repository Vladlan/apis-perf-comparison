What to try:
1. `autocannon -c 500 -d 20 http://localhost:8080/api/posts`
2. `artillery run local8080.yml`


# 1. autocannon
## Java

1 `npx autocannon -c 500 -d 20 http://localhost:8080/api/posts`  
Running 20s test @ http://localhost:8080/api/posts
500 connections  
┌─────────┬────────┬────────┬─────────┬─────────┬───────────┬───────────┬─────────┐  
│ Stat    │ 2.5%   │ 50%    │ 97.5%   │ 99%     │ Avg       │ Stdev     │ Max     │  
├─────────┼────────┼────────┼─────────┼─────────┼───────────┼───────────┼─────────┤  
│ Latency │ 128 ms │ 255 ms │ 1180 ms │ 3694 ms │ 388.63 ms │ 542.51 ms │ 5547 ms │  
└─────────┴────────┴────────┴─────────┴─────────┴───────────┴───────────┴─────────┘  
┌───────────┬─────┬──────┬────────┬────────┬──────────┬────────┬─────────┐  
│ Stat      │ 1%  │ 2.5% │ 50%    │ 97.5%  │ Avg      │ Stdev  │ Min     │  
├───────────┼─────┼──────┼────────┼────────┼──────────┼────────┼─────────┤  
│ Req/Sec   │ 0   │ 0    │ 1,511  │ 2,311  │ 1,352.79 │ 674.91 │ 95      │  
├───────────┼─────┼──────┼────────┼────────┼──────────┼────────┼─────────┤  
│ Bytes/Sec │ 0 B │ 0 B  │ 354 kB │ 541 kB │ 317 kB   │ 158 kB │ 22.2 kB │  
└───────────┴─────┴──────┴────────┴────────┴──────────┴────────┴─────────┘  

Req/Bytes counts sampled once per second.
#of samples: 19

26k requests in 20.38s, 6.01 MB read



2`npx autocannon -c 500 -d 20 http://localhost:8080/api/posts`  
Running 20s test @ http://localhost:8080/api/posts  
500 connections  
┌─────────┬───────┬────────┬────────┬─────────┬───────────┬───────────┬─────────┐  
│ Stat    │ 2.5%  │ 50%    │ 97.5%  │ 99%     │ Avg       │ Stdev     │ Max     │  
├─────────┼───────┼────────┼────────┼─────────┼───────────┼───────────┼─────────┤  
│ Latency │ 78 ms │ 120 ms │ 541 ms │ 1386 ms │ 181.22 ms │ 178.23 ms │ 1615 ms │  
└─────────┴───────┴────────┴────────┴─────────┴───────────┴───────────┴─────────┘  
┌───────────┬─────┬──────┬────────┬────────┬──────────┬──────────┬────────┐  
│ Stat      │ 1%  │ 2.5% │ 50%    │ 97.5%  │ Avg      │ Stdev    │ Min    │  
├───────────┼─────┼──────┼────────┼────────┼──────────┼──────────┼────────┤  
│ Req/Sec   │ 0   │ 0    │ 2,693  │ 3,531  │ 2,001.35 │ 1,383.69 │ 1,760  │  
├───────────┼─────┼──────┼────────┼────────┼──────────┼──────────┼────────┤  
│ Bytes/Sec │ 0 B │ 0 B  │ 630 kB │ 826 kB │ 468 kB   │ 324 kB   │ 412 kB │  
└───────────┴─────┴──────┴────────┴────────┴──────────┴──────────┴────────┘  

Req/Bytes counts sampled once per second.
#of samples: 20

41k requests in 20.41s, 9.37 MB read



## NodeJS
1 `npx autocannon -c 500 -d 20 http://localhost:3000/api/posts`
Running 20s test @ http://localhost:3000/api/posts
500 connections  
┌─────────┬────────┬────────┬─────────┬─────────┬───────────┬───────────┬─────────┐  
│ Stat    │ 2.5%   │ 50%    │ 97.5%   │ 99%     │ Avg       │ Stdev     │ Max     │  
├─────────┼────────┼────────┼─────────┼─────────┼───────────┼───────────┼─────────┤  
│ Latency │ 472 ms │ 662 ms │ 2135 ms │ 5334 ms │ 772.24 ms │ 777.74 ms │ 8036 ms │  
└─────────┴────────┴────────┴─────────┴─────────┴───────────┴───────────┴─────────┘  
┌───────────┬─────────┬─────────┬────────┬────────┬────────┬─────────┬─────────┐  
│ Stat      │ 1%      │ 2.5%    │ 50%    │ 97.5%  │ Avg    │ Stdev   │ Min     │  
├───────────┼─────────┼─────────┼────────┼────────┼────────┼─────────┼─────────┤  
│ Req/Sec   │ 101     │ 101     │ 663    │ 836    │ 639.85 │ 186.68  │ 101     │  
├───────────┼─────────┼─────────┼────────┼────────┼────────┼─────────┼─────────┤  
│ Bytes/Sec │ 29.7 kB │ 29.7 kB │ 195 kB │ 246 kB │ 188 kB │ 54.9 kB │ 29.7 kB │  
└───────────┴─────────┴─────────┴────────┴────────┴────────┴─────────┴─────────┘  

Req/Bytes counts sampled once per second.
#of samples: 20

13k requests in 20.3s, 3.76 MB read

2 `npx autocannon -c 500 -d 20 http://localhost:3000/api/posts`  
Running 20s test @ http://localhost:3000/api/posts  
500 connections  
┌─────────┬────────┬────────┬─────────┬─────────┬───────────┬───────────┬─────────┐  
│ Stat    │ 2.5%   │ 50%    │ 97.5%   │ 99%     │ Avg       │ Stdev     │ Max     │  
├─────────┼────────┼────────┼─────────┼─────────┼───────────┼───────────┼─────────┤  
│ Latency │ 558 ms │ 694 ms │ 1457 ms │ 1956 ms │ 738.53 ms │ 207.18 ms │ 2180 ms │  
└─────────┴────────┴────────┴─────────┴─────────┴───────────┴───────────┴─────────┘  
┌───────────┬─────────┬─────────┬────────┬────────┬────────┬─────────┬─────────┐  
│ Stat      │ 1%      │ 2.5%    │ 50%    │ 97.5%  │ Avg    │ Stdev   │ Min     │  
├───────────┼─────────┼─────────┼────────┼────────┼────────┼─────────┼─────────┤  
│ Req/Sec   │ 45      │ 45      │ 716    │ 846    │ 669.45 │ 169.9   │ 45      │  
├───────────┼─────────┼─────────┼────────┼────────┼────────┼─────────┼─────────┤  
│ Bytes/Sec │ 13.2 kB │ 13.2 kB │ 211 kB │ 249 kB │ 197 kB │ 49.9 kB │ 13.2 kB │  
└───────────┴─────────┴─────────┴────────┴────────┴────────┴─────────┴─────────┘  

Req/Bytes counts sampled once per second.  
#of samples: 20  
14k requests in 20.26s, 3.94 MB read



## After `process.env.UV_THREADPOOL_SIZE = OS.cpus().length;`

1 `npx autocannon -c 500 -d 20 http://localhost:3000/api/posts`  
Running 20s test @ http://localhost:3000/api/posts  
500 connections  
┌─────────┬────────┬────────┬─────────┬─────────┬───────────┬───────────┬─────────┐  
│ Stat    │ 2.5%   │ 50%    │ 97.5%   │ 99%     │ Avg       │ Stdev     │ Max     │  
├─────────┼────────┼────────┼─────────┼─────────┼───────────┼───────────┼─────────┤  
│ Latency │ 590 ms │ 696 ms │ 1746 ms │ 2139 ms │ 758.61 ms │ 247.34 ms │ 2360 ms │  
└─────────┴────────┴────────┴─────────┴─────────┴───────────┴───────────┴─────────┘  
┌───────────┬─────┬──────┬────────┬────────┬────────┬────────┬───────┐  
│ Stat      │ 1%  │ 2.5% │ 50%    │ 97.5%  │ Avg    │ Stdev  │ Min   │  
├───────────┼─────┼──────┼────────┼────────┼────────┼────────┼───────┤  
│ Req/Sec   │ 0   │ 0    │ 683    │ 830    │ 650.96 │ 183.51 │ 330   │  
├───────────┼─────┼──────┼────────┼────────┼────────┼────────┼───────┤  
│ Bytes/Sec │ 0 B │ 0 B  │ 201 kB │ 244 kB │ 191 kB │ 54 kB  │ 97 kB │  
└───────────┴─────┴──────┴────────┴────────┴────────┴────────┴───────┘  
  
Req/Bytes counts sampled once per second.  
#of samples: 20  
14k requests in 20.25s, 3.83 MB read  

2 `npx autocannon -c 500 -d 20 http://localhost:3000/api/posts`  
Running 20s test @ http://localhost:3000/api/posts
500 connections  
┌─────────┬────────┬────────┬─────────┬─────────┬───────────┬───────────┬─────────┐  
│ Stat    │ 2.5%   │ 50%    │ 97.5%   │ 99%     │ Avg       │ Stdev     │ Max     │  
├─────────┼────────┼────────┼─────────┼─────────┼───────────┼───────────┼─────────┤  
│ Latency │ 550 ms │ 654 ms │ 1676 ms │ 1857 ms │ 697.43 ms │ 214.94 ms │ 2015 ms │  
└─────────┴────────┴────────┴─────────┴─────────┴───────────┴───────────┴─────────┘  
┌───────────┬─────┬──────┬────────┬────────┬────────┬─────────┬────────┐  
│ Stat      │ 1%  │ 2.5% │ 50%    │ 97.5%  │ Avg    │ Stdev   │ Min    │  
├───────────┼─────┼──────┼────────┼────────┼────────┼─────────┼────────┤  
│ Req/Sec   │ 0   │ 0    │ 766    │ 870    │ 722.4  │ 177.6   │ 601    │  
├───────────┼─────┼──────┼────────┼────────┼────────┼─────────┼────────┤  
│ Bytes/Sec │ 0 B │ 0 B  │ 225 kB │ 256 kB │ 212 kB │ 52.2 kB │ 177 kB │  
└───────────┴─────┴──────┴────────┴────────┴────────┴─────────┴────────┘  
  
Req/Bytes counts sampled once per second.  
#of samples: 20  
15k requests in 20.72s, 4.25 MB read