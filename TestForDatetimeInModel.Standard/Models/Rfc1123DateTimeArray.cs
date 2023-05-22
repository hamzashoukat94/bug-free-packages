// <copyright file="Rfc1123DateTimeArray.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace TestForDatetimeInModel.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using TestForDatetimeInModel.Standard;
    using TestForDatetimeInModel.Standard.Utilities;

    /// <summary>
    /// Rfc1123DateTimeArray.
    /// </summary>
    public class Rfc1123DateTimeArray
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Rfc1123DateTimeArray"/> class.
        /// </summary>
        public Rfc1123DateTimeArray()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Rfc1123DateTimeArray"/> class.
        /// </summary>
        /// <param name="dateTime">dateTime.</param>
        public Rfc1123DateTimeArray(
            List<DateTime> dateTime)
        {
            this.DateTime = dateTime;
        }

        /// <summary>
        /// Gets or sets DateTime.
        /// </summary>
        [JsonConverter(typeof(ListDateTimeConverter), typeof(CustomDateTimeConverter), "r")]
        [JsonProperty("dateTime")]
        public List<DateTime> DateTime { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"Rfc1123DateTimeArray : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }
            return obj is Rfc1123DateTimeArray other &&                ((this.DateTime == null && other.DateTime == null) || (this.DateTime?.Equals(other.DateTime) == true));
        }
        
        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.DateTime = {(this.DateTime == null ? "null" : $"[{string.Join(", ", this.DateTime)} ]")}");
        }
    }
}