using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using System;
using System.IO;

namespace Algorithms.src.helper_functions {
    class Helpers {
        public static JObject GetJsonObject(string fileName, string path) {
            JObject output = null;
            try {
                output = (JObject)JsonConvert.DeserializeObject(new StreamReader(Path.GetFullPath("Algorithms.iml").Split("bin\\Debug")[0] + path + fileName).ReadToEnd());
            } catch (Exception) { }//try {
            return output;
        }//public static JObject GetJsonObject(string fileName, string path) {
    }//class Helpers {
}//namespace Algorithms.src.helper_functions {